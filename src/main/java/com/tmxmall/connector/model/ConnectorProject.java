package com.tmxmall.connector.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ConnectorProject implements Serializable {

    private String projectId;

    private int connectorType;

    private String yicatGroupId;

    private String yicatProjectId;

    private String oauthToken;

    private String oauthUserName;

    private Date createTime;

    private Date modifyTime;

    private String managerUserId;

}
