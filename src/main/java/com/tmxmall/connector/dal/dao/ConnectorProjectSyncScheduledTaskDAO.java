package com.tmxmall.connector.dal.dao;


import com.tmxmall.connector.dal.entity.ConnectorProjectSyncScheduledTaskDO;
import com.tmxmall.connector.dal.mapper.ConnectorProjectSyncScheduledTaskDOMapper;
import com.tmxmall.connector.util.StringUtil;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;

@Repository
public class ConnectorProjectSyncScheduledTaskDAO {

    @Resource
    private ConnectorProjectSyncScheduledTaskDOMapper mapper;

    public ConnectorProjectSyncScheduledTaskDO getDefault() {
        ConnectorProjectSyncScheduledTaskDO syncScheduledTaskDO = new ConnectorProjectSyncScheduledTaskDO();
        syncScheduledTaskDO.setfEnabled((byte) 1);
        syncScheduledTaskDO.setfCreateTime(new Date());
        syncScheduledTaskDO.setfModifyTime(new Date());
        syncScheduledTaskDO.setfJobCronPull("");
        syncScheduledTaskDO.setfJobCronPush("");
        syncScheduledTaskDO.setfJobPullKey("");
        syncScheduledTaskDO.setfJobPushKey("");
        syncScheduledTaskDO.setfProjectId("");
        syncScheduledTaskDO.setfJobId(StringUtil.getRandomId());
        return syncScheduledTaskDO;
    }

    public void insertConnectorScheduleTask(ConnectorProjectSyncScheduledTaskDO scheduledTaskDO) {
        mapper.insert(scheduledTaskDO);
    }
}
