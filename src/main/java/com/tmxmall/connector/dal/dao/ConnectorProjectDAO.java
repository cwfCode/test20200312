package com.tmxmall.connector.dal.dao;


import com.tmxmall.connector.dal.entity.ConnectorProjectDO;
import com.tmxmall.connector.dal.entity.ConnectorProjectDOExample;
import com.tmxmall.connector.dal.mapper.ConnectorProjectDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;

@Repository
public class ConnectorProjectDAO {

    @Resource
    private ConnectorProjectDOMapper mapper;

    public ConnectorProjectDO getDefault(){
        ConnectorProjectDO connectorProjectDO = new ConnectorProjectDO();
        connectorProjectDO.setfEnabled((byte) 1);
        connectorProjectDO.setfConnectorType(0);
        connectorProjectDO.setfCreateTime(new Date());
        connectorProjectDO.setfModifyTime(new Date());
        connectorProjectDO.setfManagerUserId("");
        connectorProjectDO.setfOauthToken("");
        connectorProjectDO.setfOauthUserName("");
        connectorProjectDO.setfYicatGroupId("");
        connectorProjectDO.setfYicatProjectId("");
        connectorProjectDO.setfProjectId("");
        return connectorProjectDO;
    }

    public void insertConnectorProject(ConnectorProjectDO connectorProjectDO) {
        mapper.insert(connectorProjectDO);
    }


}
