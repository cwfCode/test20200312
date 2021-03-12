package com.tmxmall.connector.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class ConnectorProjectSyncScheduledTaskDO implements Serializable {
    private Integer fId;

    private Byte fEnabled;

    private String fJobId;

    private String fProjectId;

    private String fJobCronPull;

    private String fJobPullKey;

    private String fJobCronPush;

    private String fJobPushKey;

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

    public String getfJobId() {
        return fJobId;
    }

    public void setfJobId(String fJobId) {
        this.fJobId = fJobId == null ? null : fJobId.trim();
    }

    public String getfProjectId() {
        return fProjectId;
    }

    public void setfProjectId(String fProjectId) {
        this.fProjectId = fProjectId == null ? null : fProjectId.trim();
    }

    public String getfJobCronPull() {
        return fJobCronPull;
    }

    public void setfJobCronPull(String fJobCronPull) {
        this.fJobCronPull = fJobCronPull == null ? null : fJobCronPull.trim();
    }

    public String getfJobPullKey() {
        return fJobPullKey;
    }

    public void setfJobPullKey(String fJobPullKey) {
        this.fJobPullKey = fJobPullKey == null ? null : fJobPullKey.trim();
    }

    public String getfJobCronPush() {
        return fJobCronPush;
    }

    public void setfJobCronPush(String fJobCronPush) {
        this.fJobCronPush = fJobCronPush == null ? null : fJobCronPush.trim();
    }

    public String getfJobPushKey() {
        return fJobPushKey;
    }

    public void setfJobPushKey(String fJobPushKey) {
        this.fJobPushKey = fJobPushKey == null ? null : fJobPushKey.trim();
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
        sb.append(", fJobId=").append(fJobId);
        sb.append(", fProjectId=").append(fProjectId);
        sb.append(", fJobCronPull=").append(fJobCronPull);
        sb.append(", fJobPullKey=").append(fJobPullKey);
        sb.append(", fJobCronPush=").append(fJobCronPush);
        sb.append(", fJobPushKey=").append(fJobPushKey);
        sb.append(", fCreateTime=").append(fCreateTime);
        sb.append(", fModifyTime=").append(fModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}