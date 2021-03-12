package com.tmxmall.connector.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class ConnectorBranch implements Serializable {

    private String repositoryId;

    private String branchId;

    private String branchSha;

    private String pushBranchName;

    private String pushBranchSHA;

    private String oauthUserName;

    private String pushPath;

    private Date createTime;

    private Date modifyTime;

    private List<ConnectorFile> connectorFileList;

}
