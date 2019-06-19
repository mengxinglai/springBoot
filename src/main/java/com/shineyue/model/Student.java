package com.shineyue.model;

public class Student {
    private String tId;

    private String tName;

    private Short tAge;

    private String tSex;

    private String tTeamId;

    private Short tStatus;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Short gettAge() {
        return tAge;
    }

    public void settAge(Short tAge) {
        this.tAge = tAge;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public String gettTeamId() {
        return tTeamId;
    }

    public void settTeamId(String tTeamId) {
        this.tTeamId = tTeamId == null ? null : tTeamId.trim();
    }

    public Short gettStatus() {
        return tStatus;
    }

    public void settStatus(Short tStatus) {
        this.tStatus = tStatus;
    }
}