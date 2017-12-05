package com.zanzhu.pojo;

public class ZanzhuUnion {
    private Integer unionId;

    private String unionName;

    private String unionSchool;

    private String contactName;

    private String contactEmail;

    private String contactPhone;

    private String contactSex;

    private String unionPassword;

    public Integer getUnionId() {
        return unionId;
    }

    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    public String getUnionSchool() {
        return unionSchool;
    }

    public void setUnionSchool(String unionSchool) {
        this.unionSchool = unionSchool == null ? null : unionSchool.trim();
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

    public String getUnionPassword() {
        return unionPassword;
    }

    public void setUnionPassword(String unionPassword) {
        this.unionPassword = unionPassword == null ? null : unionPassword.trim();
    }
}