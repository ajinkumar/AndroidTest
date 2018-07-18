package com.example.androidtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ajin kumar on 18/7/18.
 */
public class Entity {

    @SerializedName("panicId")
    @Expose
    private Integer panicId;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("userId")
    @Expose
    private UserId userId;
    @SerializedName("created_On")
    @Expose
    private String createdOn;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("watchlist")
    @Expose
    private Boolean watchlist;
    @SerializedName("read")
    @Expose
    private Boolean read;
    @SerializedName("fileType")
    @Expose
    private String fileType;
    @SerializedName("fileUrl")
    @Expose
    private String fileUrl;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("ratio")
    @Expose
    private String ratio;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("mywatchlist")
    @Expose
    private Boolean mywatchlist;
    @SerializedName("commentCount")
    @Expose
    private Integer commentCount;
    @SerializedName("smallUrl")
    @Expose
    private String smallUrl;
    @SerializedName("largeUrl")
    @Expose
    private String largeUrl;

    public Integer getPanicId() {
        return panicId;
    }

    public void setPanicId(Integer panicId) {
        this.panicId = panicId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getWatchlist() {
        return watchlist;
    }

    public void setWatchlist(Boolean watchlist) {
        this.watchlist = watchlist;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Boolean getMywatchlist() {
        return mywatchlist;
    }

    public void setMywatchlist(Boolean mywatchlist) {
        this.mywatchlist = mywatchlist;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getSmallUrl() {
        return smallUrl;
    }

    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    public String getLargeUrl() {
        return largeUrl;
    }

    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

}
