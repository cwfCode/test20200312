package com.tmxmall.connector.dal.dao;


import com.tmxmall.connector.dal.entity.ConnectorFileDO;
import com.tmxmall.connector.dal.entity.ConnectorFileDOExample;
import com.tmxmall.connector.dal.mapper.ConnectorFileDOMapper;
import com.tmxmall.connector.util.StringUtil;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class ConnectorFileDAO {

    @Resource
    private ConnectorFileDOMapper mapper;

    public ConnectorFileDO getDefault() {
        ConnectorFileDO connectorFileDO = new ConnectorFileDO();
        connectorFileDO.setfEnabled((byte) 1);
        connectorFileDO.setfCreateTime(new Date());
        connectorFileDO.setfModifyTime(new Date());
        connectorFileDO.setfBranchId("");
        connectorFileDO.setfFileId(StringUtil.getRandomId());
        connectorFileDO.setfFileName("");
        connectorFileDO.setfFileSha("");
        connectorFileDO.setfOriginalFileId("");
        connectorFileDO.setfParentPath("");

        return connectorFileDO;
    }


    public void insertConnectorFile(ConnectorFileDO connectorFileDO) {
        mapper.insert(connectorFileDO);
    }
    
    public List<ConnectorFileDO> listConnectorFileDOs(String branchId) {
        ConnectorFileDOExample example = new ConnectorFileDOExample();
        ConnectorFileDOExample.Criteria criteria = example.createCriteria();
        criteria.andFEnabledEqualTo((byte) 1);
        criteria.andFBranchIdEqualTo(branchId);
        return mapper.selectByExample(example);
    }

    public void updateByFileId(ConnectorFileDO connectorFileDO, String fileId) {
        connectorFileDO.setfModifyTime(new Date());
        ConnectorFileDOExample example = new ConnectorFileDOExample();
        ConnectorFileDOExample.Criteria criteria = example.createCriteria();
        criteria.andFEnabledEqualTo((byte) 1);
        criteria.andFFileIdEqualTo(fileId);
        mapper.updateByExampleSelective(connectorFileDO, example);
    }
}
