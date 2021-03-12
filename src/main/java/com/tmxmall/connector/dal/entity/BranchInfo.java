package com.tmxmall.connector.dal.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel(value = "分支信息")
public class BranchInfo {

    /**
     * 分支名称
     */
    @ApiModelProperty(value = "分支名称")
    private String branchName;

    /**
     * 分支sha
     */
    @ApiModelProperty(value = "分支sha")
    private String branchSHA;
}
