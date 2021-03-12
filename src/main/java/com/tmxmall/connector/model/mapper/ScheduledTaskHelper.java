package com.tmxmall.connector.model.mapper;


import com.tmxmall.connector.dal.entity.ConnectorProjectSyncScheduledTaskDO;
import com.tmxmall.connector.model.ScheduledTask;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduledTaskHelper {

    ScheduledTaskHelper INSTANCE = Mappers.getMapper(ScheduledTaskHelper.class);

    @Mappings(value =
            {
                    @Mapping(target = "fEnabled", ignore = true),
                    @Mapping(target = "fJobId", source = "jobId"),
                    @Mapping(target = "fProjectId", source = "projectId"),
                    @Mapping(target = "fJobCronPull", source = "jobCronPull"),
                    @Mapping(target = "fJobPullKey", source = "jobPullKey"),
                    @Mapping(target = "fJobCronPush", source = "jobCronPush"),
                    @Mapping(target = "fCreateTime", source = "createTime"),
                    @Mapping(target = "fModifyTime", source = "modifyTime")
            })
    ConnectorProjectSyncScheduledTaskDO transForm(@MappingTarget ConnectorProjectSyncScheduledTaskDO connectorProjectSyncScheduledTaskDO,
                                                  ScheduledTask scheduledTask);


}
