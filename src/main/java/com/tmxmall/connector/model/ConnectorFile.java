package com.tmxmall.connector.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ConnectorFile implements Serializable {

    private String fileId;

    private int originalFileId;

    private String fileName;

    private String fileSHA;

    private String parentPath;

    private String branchId;

    private Date createTime;

    private Date modifyTime;
}
