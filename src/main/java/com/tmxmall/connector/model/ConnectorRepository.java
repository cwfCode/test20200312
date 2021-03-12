package com.tmxmall.connector.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class ConnectorRepository implements Serializable {

    private String repositoryId;

    private String repositoryName;

    private String projectId;

    private Date createTime;

    private Date modifyTime;

    private List<ConnectorBranch> connectorBranchList;

}
