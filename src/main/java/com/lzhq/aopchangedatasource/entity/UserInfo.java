package com.lzhq.aopchangedatasource.entity;

public class UserInfo {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private Integer id;
    private String remarks;
}
