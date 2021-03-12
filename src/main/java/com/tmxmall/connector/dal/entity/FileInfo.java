package com.tmxmall.connector.dal.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(value = "文件信息")
public class FileInfo {

    /**
     * 文件名称
     */
    @ApiModelProperty(value = "文件名称")
    private String fileName;

    /**
     * 文件sha
     */
    @ApiModelProperty(value = "文件sha")
    private String fileSHA;

    /**
     * 文件类型
     */
    @ApiModelProperty(value = "文件类型")
    private String fileType;

    /**
     * 文件夹
     */
    @ApiModelProperty(value = "文件夹")
    private List<FileInfo> fileInfoList;

    /**
     * 文件父路径
     */
    @ApiModelProperty(value = "文件父路径")
    private String parentPath;


    public FileInfo(String fileName, String fileSHA, String parentPath, String fileType) {
        this.fileName = fileName;
        this.fileSHA = fileSHA;
        this.parentPath = parentPath;
        this.fileType = fileType;
        this.fileInfoList = new ArrayList<>();
    }
}
