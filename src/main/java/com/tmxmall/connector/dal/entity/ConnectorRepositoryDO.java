package com.tmxmall.connector.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class ConnectorRepositoryDO implements Serializable {
    private Integer fId;

    private Byte fEnabled;

    private String fRepositoryId;

    private String fRepositoryName;

    private String fProjectId;

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

    public String getfRepositoryId() {
        return fRepositoryId;
    }

    public void setfRepositoryId(String fRepositoryId) {
        this.fRepositoryId = fRepositoryId == null ? null : fRepositoryId.trim();
    }

    public String getfRepositoryName() {
        return fRepositoryName;
    }

    public void setfRepositoryName(String fRepositoryName) {
        this.fRepositoryName = fRepositoryName == null ? null : fRepositoryName.trim();
    }

    public String getfProjectId() {
        return fProjectId;
    }

    public void setfProjectId(String fProjectId) {
        this.fProjectId = fProjectId == null ? null : fProjectId.trim();
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
        sb.append(", fRepositoryId=").append(fRepositoryId);
        sb.append(", fRepositoryName=").append(fRepositoryName);
        sb.append(", fProjectId=").append(fProjectId);
        sb.append(", fCreateTime=").append(fCreateTime);
        sb.append(", fModifyTime=").append(fModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}