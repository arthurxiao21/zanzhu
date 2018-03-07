package com.zanzhu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Sponsor {
    private Integer sponsorId;

    private String sponsorName;

    private Date startTime;

    private Date endTime;

    private String sponsorAddress;

    private String sponsorCategory;

    private BigDecimal sponsorMoney;

    private String sponsorAttachment;

    private Integer sponsorCompanyId;

    private String sponsorPlan;

    public Integer getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName == null ? null : sponsorName.trim();
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

    public String getSponsorAddress() {
        return sponsorAddress;
    }

    public void setSponsorAddress(String sponsorAddress) {
        this.sponsorAddress = sponsorAddress == null ? null : sponsorAddress.trim();
    }

    public String getSponsorCategory() {
        return sponsorCategory;
    }

    public void setSponsorCategory(String sponsorCategory) {
        this.sponsorCategory = sponsorCategory == null ? null : sponsorCategory.trim();
    }

    public BigDecimal getSponsorMoney() {
        return sponsorMoney;
    }

    public void setSponsorMoney(BigDecimal sponsorMoney) {
        this.sponsorMoney = sponsorMoney;
    }

    public String getSponsorAttachment() {
        return sponsorAttachment;
    }

    public void setSponsorAttachment(String sponsorAttachment) {
        this.sponsorAttachment = sponsorAttachment == null ? null : sponsorAttachment.trim();
    }

    public Integer getSponsorCompanyId() {
        return sponsorCompanyId;
    }

    public void setSponsorCompanyId(Integer sponsorCompanyId) {
        this.sponsorCompanyId = sponsorCompanyId;
    }

    public String getSponsorPlan() {
        return sponsorPlan;
    }

    public void setSponsorPlan(String sponsorPlan) {
        this.sponsorPlan = sponsorPlan == null ? null : sponsorPlan.trim();
    }
}