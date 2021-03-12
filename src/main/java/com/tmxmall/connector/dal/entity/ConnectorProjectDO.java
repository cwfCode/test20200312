package com.tmxmall.connector.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class ConnectorProjectDO implements Serializable {
    private Integer fId;

    private Byte fEnabled;

    private String fProjectId;

    private String fYicatGroupId;

    private String fYicatProjectId;

    private Integer fConnectorType;

    private String fOauthToken;

    private String fOauthUserName;

    private String fManagerUserId;

    private Date fCreateTime;

    private Date fModifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Byte getfEnabled() {
        return fEnabled;
    }

    public void setfEnabled(Byte fEnabled) {
        this.fEnabled = fEnabled;
    }

    public String getfProjectId() {
        return fProjectId;
    }

    public void setfProjectId(String fProjectId) {
        this.fProjectId = fProjectId == null ? null : fProjectId.trim();
    }

    public String getfYicatGroupId() {
        return fYicatGroupId;
    }

    public void setfYicatGroupId(String fYicatGroupId) {
        this.fYicatGroupId = fYicatGroupId == null ? null : fYicatGroupId.trim();
    }

    public String getfYicatProjectId() {
        return fYicatProjectId;
    }

    public void setfYicatProjectId(String fYicatProjectId) {
        this.fYicatProjectId = fYicatProjectId == null ? null : fYicatProjectId.trim();
    }

    public Integer getfConnectorType() {
        return fConnectorType;
    }

    public void setfConnectorType(Integer fConnectorType) {
        this.fConnectorType = fConnectorType;
    }

    public String getfOauthToken() {
        return fOauthToken;
    }

    public void setfOauthToken(String fOauthToken) {
        this.fOauthToken = fOauthToken == null ? null : fOauthToken.trim();
    }

    public String getfOauthUserName() {
        return fOauthUserName;
    }

    public void setfOauthUserName(String fOauthUserName) {
        this.fOauthUserName = fOauthUserName == null ? null : fOauthUserName.trim();
    }

    public String getfManagerUserId() {
        return fManagerUserId;
    }

    public void setfManagerUserId(String fManagerUserId) {
        this.fManagerUserId = fManagerUserId == null ? null : fManagerUserId.trim();
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public Date getfModifyTime() {
        return fModifyTime;
    }

    public void setfModifyTime(Date fModifyTime) {
        this.fModifyTime = fModifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fEnabled=").append(fEnabled);
        sb.append(", fProjectId=").append(fProjectId);
        sb.append(", fYicatGroupId=").append(fYicatGroupId);
        sb.append(", fYicatProjectId=").append(fYicatProjectId);
        sb.append(", fConnectorType=").append(fConnectorType);
        sb.append(", fOauthToken=").append(fOauthToken);
        sb.append(", fOauthUserName=").append(fOauthUserName);
        sb.append(", fManagerUserId=").append(fManagerUserId);
        sb.append(", fCreateTime=").append(fCreateTime);
        sb.append(", fModifyTime=").append(fModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}