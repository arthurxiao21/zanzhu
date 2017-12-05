package com.zanzhu.pojo;

public class ZanzhuCompany {
    private Integer companyId;

    private String companyName;

    private String companyKind;

    private String companySize;

    private String companyCategory;

    private String contactName;

    private String contactEmail;

    private String contactPhone;

    private String contactSex;

    private String companyPassword;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyKind() {
        return companyKind;
    }

    public void setCompanyKind(String companyKind) {
        this.companyKind = companyKind == null ? null : companyKind.trim();
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize == null ? null : companySize.trim();
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory == null ? null : companyCategory.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactSex() {
        return contactSex;
    }

    public void setContactSex(String contactSex) {
        this.contactSex = contactSex == null ? null : contactSex.trim();
    }

    public String getCompanyPassword() {
        return companyPassword;
    }

    public void setCompanyPassword(String companyPassword) {
        this.companyPassword = companyPassword == null ? null : companyPassword.trim();
    }
}