package com.tmxmall.connector.model;

import lombok.Data;

import java.util.Date;

@Data
public class ScheduledTask {

    private String jobId;
    private String projectId;
    private String jobCronPull;
    private String jobCronPush;
    private String jobPullKey;
    private String jobPushKe;
    private Date createTime;
    private Date modifyTime;

}
