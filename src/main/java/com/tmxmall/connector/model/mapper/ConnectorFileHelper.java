package com.tmxmall.connector.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.tmxmall.connector.dal.entity.ConnectorFileDO;
import com.tmxmall.connector.model.ConnectorFile;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConnectorFileHelper {

    ConnectorFileHelper INSTANCE = Mappers.getMapper(ConnectorFileHelper.class);

    @Mappings(value =
            {
                    @Mapping(target = "fEnabled", ignore = true),
                    @Mapping(target = "fBranchId", source = "branchId"),
                    @Mapping(target = "fFileId", source = "fileId"),
                    @Mapping(target = "fOriginalFileId", source = "originalFileId"),
                    @Mapping(target = "fFileSha", source = "fileSHA"),
                    @Mapping(target = "fFileName", source = "fileName"),
                    @Mapping(target = "fParentPath", source = "parentPath"),
                    @Mapping(target = "fCreateTime", source = "createTime"),
                    @Mapping(target = "fModifyTime", source = "modifyTime")
            })
    ConnectorFileDO transForm(@MappingTarget ConnectorFileDO connectorFileDO,
                              ConnectorFile connectorFile);

    List<ConnectorFileDO> transForm(List<ConnectorFile> connectorFileList);
}
