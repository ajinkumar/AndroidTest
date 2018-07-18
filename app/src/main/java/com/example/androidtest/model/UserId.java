package com.example.androidtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class UserId {

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("streetName")
    @Expose
    private String streetName;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("kinName")
    @Expose
    private Object kinName;
    @SerializedName("kinPrimaryNumber")
    @Expose
    private String kinPrimaryNumber;
    @SerializedName("kinSecondaryNumber")
    @Expose
    private String kinSecondaryNumber;
    @SerializedName("securityPin")
    @Expose
    private String securityPin;
    @SerializedName("createdOn")
    @Expose
    private String createdOn;
    @SerializedName("userType")
    @Expose
    private UserType userType;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("userImage")
    @Expose
    private String userImage;
    @SerializedName("notificationStatus")
    @Expose
    private Boolean notificationStatus;
    @SerializedName("locationStatus")
    @Expose
    private Boolean locationStatus;
    @SerializedName("hideName")
    @Expose
    private Boolean hideName;
    @SerializedName("inviteFlag")
    @Expose
    private Boolean inviteFlag;
    @SerializedName("alertDistance")
    @Expose
    private String alertDistance;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("kinCountryCode")
    @Expose
    private String kinCountryCode;
    @SerializedName("kinCountry")
    @Expose
    private String kinCountry;
    @SerializedName("blocked")
    @Expose
    private Boolean blocked;
    @SerializedName("activation_link")
    @Expose
    private Object activationLink;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("newPin")
    @Expose
    private Object newPin;
    @SerializedName("language")
    @Expose
    private Object language;
    @SerializedName("retypePin")
    @Expose
    private Object retypePin;
    @SerializedName("usercount")
    @Expose
    private Integer usercount;
    @SerializedName("alertpendingcount")
    @Expose
    private Integer alertpendingcount;
    @SerializedName("alertresolvecount")
    @Expose
    private Integer alertresolvecount;
    @SerializedName("confPassword")
    @Expose
    private Object confPassword;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getKinName() {
        return kinName;
    }

    public void setKinName(Object kinName) {
        this.kinName = kinName;
    }

    public String getKinPrimaryNumber() {
        return kinPrimaryNumber;
    }

    public void setKinPrimaryNumber(String kinPrimaryNumber) {
        this.kinPrimaryNumber = kinPrimaryNumber;
    }

    public String getKinSecondaryNumber() {
        return kinSecondaryNumber;
    }

    public void setKinSecondaryNumber(String kinSecondaryNumber) {
        this.kinSecondaryNumber = kinSecondaryNumber;
    }

    public String getSecurityPin() {
        return securityPin;
    }

    public void setSecurityPin(String securityPin) {
        this.securityPin = securityPin;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Boolean getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(Boolean notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public Boolean getLocationStatus() {
        return locationStatus;
    }

    public void setLocationStatus(Boolean locationStatus) {
        this.locationStatus = locationStatus;
    }

    public Boolean getHideName() {
        return hideName;
    }

    public void setHideName(Boolean hideName) {
        this.hideName = hideName;
    }

    public Boolean getInviteFlag() {
        return inviteFlag;
    }

    public void setInviteFlag(Boolean inviteFlag) {
        this.inviteFlag = inviteFlag;
    }

    public String getAlertDistance() {
        return alertDistance;
    }

    public void setAlertDistance(String alertDistance) {
        this.alertDistance = alertDistance;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public String getKinCountryCode() {
        return kinCountryCode;
    }

    public void setKinCountryCode(String kinCountryCode) {
        this.kinCountryCode = kinCountryCode;
    }

    public String getKinCountry() {
        return kinCountry;
    }

    public void setKinCountry(String kinCountry) {
        this.kinCountry = kinCountry;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Object getActivationLink() {
        return activationLink;
    }

    public void setActivationLink(Object activationLink) {
        this.activationLink = activationLink;
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

    public Object getNewPin() {
        return newPin;
    }

    public void setNewPin(Object newPin) {
        this.newPin = newPin;
    }

    public Object getLanguage() {
        return language;
    }

    public void setLanguage(Object language) {
        this.language = language;
    }

    public Object getRetypePin() {
        return retypePin;
    }

    public void setRetypePin(Object retypePin) {
        this.retypePin = retypePin;
    }

    public Integer getUsercount() {
        return usercount;
    }

    public void setUsercount(Integer usercount) {
        this.usercount = usercount;
    }

    public Integer getAlertpendingcount() {
        return alertpendingcount;
    }

    public void setAlertpendingcount(Integer alertpendingcount) {
        this.alertpendingcount = alertpendingcount;
    }

    public Integer getAlertresolvecount() {
        return alertresolvecount;
    }

    public void setAlertresolvecount(Integer alertresolvecount) {
        this.alertresolvecount = alertresolvecount;
    }

    public Object getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(Object confPassword) {
        this.confPassword = confPassword;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}
