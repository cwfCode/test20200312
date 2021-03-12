package com.tmxmall.connector.dal.dao;

import com.tmxmall.connector.dal.entity.ConnectorBranchDO;
import com.tmxmall.connector.dal.entity.ConnectorBranchDOExample;
import com.tmxmall.connector.dal.mapper.ConnectorBranchDOMapper;
import com.tmxmall.connector.util.StringUtil;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class ConnectorBranchDAO {

    @Resource
    private ConnectorBranchDOMapper mapper;

    public ConnectorBranchDO getDefault(){
        ConnectorBranchDO connectorBranchDO = new ConnectorBranchDO();
        connectorBranchDO.setfEnabled((byte) 1);
        connectorBranchDO.setfBranchId(StringUtil.getRandomId());
        connectorBranchDO.setfBranchName("");
        connectorBranchDO.setfPushBranchSha("");
        connectorBranchDO.setfPushBranchSha("");
        connectorBranchDO.setfPushBranchName("");
        connectorBranchDO.setfPushPath("");
        connectorBranchDO.setfRepositoryId("");
        connectorBranchDO.setfCreateTime(new Date());
        connectorBranchDO.setfModifyTime(new Date());
        return connectorBranchDO;
    }


    public void insertConnectorBranch(List<ConnectorBranchDO> connectorBranchDOList) {
        connectorBranchDOList.forEach(connectorBranchDO -> mapper.insert(connectorBranchDO) );
    }

    public List<ConnectorBranchDO> listByRepositoryId(String repositoryId) {
        ConnectorBranchDOExample example = new ConnectorBranchDOExample();
        ConnectorBranchDOExample.Criteria criteria = example.createCriteria();
        criteria.andFEnabledEqualTo((byte) 1);
        criteria.andFRepositoryIdEqualTo(repositoryId);
        return mapper.selectByExample(example);
    }
}
