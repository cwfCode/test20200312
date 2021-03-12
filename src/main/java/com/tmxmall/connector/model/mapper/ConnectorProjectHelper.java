package com.tmxmall.connector.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.tmxmall.connector.dal.entity.ConnectorProjectDO;
import com.tmxmall.connector.model.ConnectorProject;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConnectorProjectHelper {
    
    ConnectorProjectHelper INSTANCE = Mappers.getMapper(ConnectorProjectHelper.class);

    @Mappings(value =
            {    @Mapping(target = "fEnabled", ignore = true),
                    @Mapping(target = "fProjectId", source = "projectId"),
                    @Mapping(target = "fYicatGroupId", source = "yicatGroupId"),
                    @Mapping(target = "fYicatProjectId", source = "yicatProjectId"),
                    @Mapping(target = "fConnectorType", source = "connectorType"),
                    @Mapping(target = "fOauthToken", source = "oauthToken"),
                    @Mapping(target = "fOauthUserName", source = "oauthUserName"),
                    @Mapping(target = "fManagerUserId", source = "managerUserId"),
                    @Mapping(target = "fCreateTime", source = "createTime"),
                    @Mapping(target = "fModifyTime", source = "modifyTime")
            })
    ConnectorProjectDO transForm(@MappingTarget ConnectorProjectDO connectorProjectDO,
                                 ConnectorProject connectorProject);


}
