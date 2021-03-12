package com.tmxmall.connector.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.tmxmall.connector.dal.entity.ConnectorRepositoryDO;
import com.tmxmall.connector.model.ConnectorRepository;


@Mapper
public interface ConnectorRepositoryHelper {

    ConnectorRepositoryHelper INSTANCE = Mappers.getMapper(ConnectorRepositoryHelper.class);


    @Mappings(value =
            {
                    @Mapping(target = "fEnabled", ignore = true),
                    @Mapping(target = "fProjectId", source = "projectId"),
                    @Mapping(target = "fRepositoryId", source = "repositoryId"),
                    @Mapping(target = "fRepositoryName", source = "repositoryName"),
                    @Mapping(target = "fCreateTime", source = "createTime"),
                    @Mapping(target = "fModifyTime", source = "modifyTime")
            })
    ConnectorRepositoryDO transForm(@MappingTarget ConnectorRepositoryDO connectorRepositoryDO, ConnectorRepository connectorRepository);


}
