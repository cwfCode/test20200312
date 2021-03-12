package com.tmxmall.connector.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class ConnectorFileDO implements Serializable {
    private Integer fId;

    private Byte fEnabled;

    private String fFileId;

    private String fOriginalFileId;

    private String fFileSha;

    private String fFileName;

    private String fParentPath;

    private String fBranchId;

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

    public String getfFileId() {
        return fFileId;
    }

    public void setfFileId(String fFileId) {
        this.fFileId = fFileId == null ? null : fFileId.trim();
    }

    public String getfOriginalFileId() {
        return fOriginalFileId;
    }

    public void setfOriginalFileId(String fOriginalFileId) {
        this.fOriginalFileId = fOriginalFileId == null ? null : fOriginalFileId.trim();
    }

    public String getfFileSha() {
        return fFileSha;
    }

    public void setfFileSha(String fFileSha) {
        this.fFileSha = fFileSha == null ? null : fFileSha.trim();
    }

    public String getfFileName() {
        return fFileName;
    }

    public void setfFileName(String fFileName) {
        this.fFileName = fFileName == null ? null : fFileName.trim();
    }

    public String getfParentPath() {
        return fParentPath;
    }

    public void setfParentPath(String fParentPath) {
        this.fParentPath = fParentPath == null ? null : fParentPath.trim();
    }

    public String getfBranchId() {
        return fBranchId;
    }

    public void setfBranchId(String fBranchId) {
        this.fBranchId = fBranchId == null ? null : fBranchId.trim();
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
        sb.append(", fFileId=").append(fFileId);
        sb.append(", fOriginalFileId=").append(fOriginalFileId);
        sb.append(", fFileSha=").append(fFileSha);
        sb.append(", fFileName=").append(fFileName);
        sb.append(", fParentPath=").append(fParentPath);
        sb.append(", fBranchId=").append(fBranchId);
        sb.append(", fCreateTime=").append(fCreateTime);
        sb.append(", fModifyTime=").append(fModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}