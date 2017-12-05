package com.zanzhu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ZanzhuActivity {
    private Integer activityId;

    private Date startTime;

    private Date endTime;

    private String activityAddress;

    private BigDecimal activityMoney;

    private String activityAttachment;

    private Integer activityUnionId;

    private String activityPlan;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }

    public BigDecimal getActivityMoney() {
        return activityMoney;
    }

    public void setActivityMoney(BigDecimal activityMoney) {
        this.activityMoney = activityMoney;
    }

    public String getActivityAttachment() {
        return activityAttachment;
    }

    public void setActivityAttachment(String activityAttachment) {
        this.activityAttachment = activityAttachment == null ? null : activityAttachment.trim();
    }

    public Integer getActivityUnionId() {
        return activityUnionId;
    }

    public void setActivityUnionId(Integer activityUnionId) {
        this.activityUnionId = activityUnionId;
    }

    public String getActivityPlan() {
        return activityPlan;
    }

    public void setActivityPlan(String activityPlan) {
        this.activityPlan = activityPlan == null ? null : activityPlan.trim();
    }
}