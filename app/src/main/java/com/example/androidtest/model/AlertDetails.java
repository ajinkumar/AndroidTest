package com.example.androidtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class AlertDetails {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("_entity")
    @Expose
    private List<Entity> entity = null;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Entity> getEntity() {
        return entity;
    }

    public void setEntity(List<Entity> entity) {
        this.entity = entity;
    }

}