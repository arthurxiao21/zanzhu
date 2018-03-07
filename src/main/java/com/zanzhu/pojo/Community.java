package com.zanzhu.pojo;

public class Community {
    private Integer userId;

    private String communityName;

    private String communitySchool;

    private String communityIntro;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public String getCommunitySchool() {
        return communitySchool;
    }

    public void setCommunitySchool(String communitySchool) {
        this.communitySchool = communitySchool == null ? null : communitySchool.trim();
    }

    public String getCommunityIntro() {
        return communityIntro;
    }

    public void setCommunityIntro(String communityIntro) {
        this.communityIntro = communityIntro == null ? null : communityIntro.trim();
    }
}