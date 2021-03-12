package com.tmxmall.connector.dal.dao;


import com.tmxmall.connector.dal.entity.ConnectorRepositoryDO;
import com.tmxmall.connector.dal.entity.ConnectorRepositoryDOExample;
import com.tmxmall.connector.dal.mapper.ConnectorRepositoryDOMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class ConnectorRepositoryDAO {

    @Resource
    private ConnectorRepositoryDOMapper mapper;

    public ConnectorRepositoryDO getDefault(){
        ConnectorRepositoryDO connectorRepositoryDO = new ConnectorRepositoryDO();
        connectorRepositoryDO.setfProjectId("");
        connectorRepositoryDO.setfEnabled((byte) 1);
        connectorRepositoryDO.setfCreateTime(new Date());
        connectorRepositoryDO.setfModifyTime(new Date());
        connectorRepositoryDO.setfRepositoryId("");
        connectorRepositoryDO.setfRepositoryName("");
        return connectorRepositoryDO;
    }

    public void insertConnectorRepository(ConnectorRepositoryDO connectorRepositoryDO) {
        mapper.insert(connectorRepositoryDO);
    }
    
    public ConnectorRepositoryDO getByProjectId(String projectId) {
        ConnectorRepositoryDOExample example = new ConnectorRepositoryDOExample();
        ConnectorRepositoryDOExample.Criteria criteria = example.createCriteria();
        criteria.andFEnabledEqualTo((byte) 1);
        criteria.andFProjectIdEqualTo(projectId);
        List<ConnectorRepositoryDO> connectorRepositoryDOList = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(connectorRepositoryDOList)) {
            return null;
        }
        return connectorRepositoryDOList.get(0);
    }
}
