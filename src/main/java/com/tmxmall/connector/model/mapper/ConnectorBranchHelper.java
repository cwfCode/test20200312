package com.tmxmall.connector.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.tmxmall.connector.dal.entity.ConnectorBranchDO;
import com.tmxmall.connector.model.ConnectorBranch;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConnectorBranchHelper {

    ConnectorBranchHelper INSTANCE = Mappers.getMapper(ConnectorBranchHelper.class);
    
    @Mappings(value =
            {
                    @Mapping(target = "fEnabled", ignore = true),
                    @Mapping(target = "fBranchId", source = "branchId"),
                    @Mapping(target = "fRepositoryId", source = "repositoryId"),
                    @Mapping(target = "fBranchSha", source = "branchSha"),
                    @Mapping(target = "fPushBranchName", source = "pushBranchName"),
                    @Mapping(target = "fPushBranchSha", source = "pushBranchSHA"),
                    @Mapping(target = "fPushPath", source = "pushPath"),
                    @Mapping(target = "fCreateTime", source = "createTime"),
                    @Mapping(target = "fModifyTime", source = "modifyTime")
            })
    ConnectorBranchDO transForm(@MappingTarget ConnectorBranchDO connectorBranchDO,
                                ConnectorBranch connectorBranch);

    List<ConnectorBranchDO> transForm(List<ConnectorBranch> connectorBranchList);
}
