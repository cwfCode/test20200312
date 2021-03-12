package com.tmxmall.connector.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class ConnectorBranchDO implements Serializable {
    private Integer fId;

    private Byte fEnabled;

    private String fBranchId;

    private String fRepositoryId;

    private String fBranchName;

    private String fBranchSha;

    private String fPushBranchName;

    private String fPushBranchSha;

    private String fPushPath;

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

    public String getfBranchId() {
        return fBranchId;
    }

    public void setfBranchId(String fBranchId) {
        this.fBranchId = fBranchId == null ? null : fBranchId.trim();
    }

    public String getfRepositoryId() {
        return fRepositoryId;
    }

    public void setfRepositoryId(String fRepositoryId) {
        this.fRepositoryId = fRepositoryId == null ? null : fRepositoryId.trim();
    }

    public String getfBranchName() {
        return fBranchName;
    }

    public void setfBranchName(String fBranchName) {
        this.fBranchName = fBranchName == null ? null : fBranchName.trim();
    }

    public String getfBranchSha() {
        return fBranchSha;
    }

    public void setfBranchSha(String fBranchSha) {
        this.fBranchSha = fBranchSha == null ? null : fBranchSha.trim();
    }

    public String getfPushBranchName() {
        return fPushBranchName;
    }

    public void setfPushBranchName(String fPushBranchName) {
        this.fPushBranchName = fPushBranchName == null ? null : fPushBranchName.trim();
    }

    public String getfPushBranchSha() {
        return fPushBranchSha;
    }

    public void setfPushBranchSha(String fPushBranchSha) {
        this.fPushBranchSha = fPushBranchSha == null ? null : fPushBranchSha.trim();
    }

    public String getfPushPath() {
        return fPushPath;
    }

    public void setfPushPath(String fPushPath) {
        this.fPushPath = fPushPath == null ? null : fPushPath.trim();
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
        sb.append(", fBranchId=").append(fBranchId);
        sb.append(", fRepositoryId=").append(fRepositoryId);
        sb.append(", fBranchName=").append(fBranchName);
        sb.append(", fBranchSha=").append(fBranchSha);
        sb.append(", fPushBranchName=").append(fPushBranchName);
        sb.append(", fPushBranchSha=").append(fPushBranchSha);
        sb.append(", fPushPath=").append(fPushPath);
        sb.append(", fCreateTime=").append(fCreateTime);
        sb.append(", fModifyTime=").append(fModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}