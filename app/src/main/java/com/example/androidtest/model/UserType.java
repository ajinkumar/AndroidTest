package com.example.androidtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ajin kumar on 18/7/18.
 */
public class UserType {

    @SerializedName("userTypeId")
    @Expose
    private Integer userTypeId;
    @SerializedName("userTypeName")
    @Expose
    private String userTypeName;

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

}
