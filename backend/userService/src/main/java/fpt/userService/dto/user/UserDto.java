package fpt.userService.dto.user;

import fpt.userService.entity.UserEntity;

import java.time.LocalDateTime;

public class UserDto {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String phoneNumber;
    private String address;
    private int profileImageId;
    private int statusId;
    private int dbStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getProfileImageId() {
        return profileImageId;
    }

    public void setProfileImageId(int profileImageId) {
        this.profileImageId = profileImageId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(int dbStatus) {
        this.dbStatus = dbStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserDto(int userId, String username, String password, String email, String fullName, String phoneNumber, String address, int profileImageId, int statusId, int dbStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.profileImageId = profileImageId;
        this.statusId = statusId;
        this.dbStatus = dbStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UserEntity toUserEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(this.username);
        userEntity.setPassword(this.password); // Password should be hashed later
        userEntity.setEmail(this.email);
        userEntity.setFullName(this.fullName);
        userEntity.setPhoneNumber(this.phoneNumber);
        userEntity.setAddress(this.address);
        userEntity.setProfileImageId(this.profileImageId);
        userEntity.setStatusId(this.statusId);
        userEntity.setDbStatus(this.dbStatus);
        return userEntity;
    }
}
