package fpt.userService.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Images")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageID;

    @Column(name = "TourID")
    private int tourID;

    @Column(name = "ProviderID")
    private int providerID;

    @Column(name = "UserID")
    private int userID;

    @Lob
    @Column(name = "ImageData")
    private byte[] imageData;

    @Column(name = "Caption")
    private String caption;

    @Column(name = "ImageType", nullable = false)
    private String imageType;

    @Column(name = "StatusID", nullable = false)
    private int statusID;

    @Column(name = "dbStatus", nullable = false)
    private int dbStatus;

    @Column(name = "CreatedAt", nullable = false)
    private Date createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private Date updatedAt;

    public ImageEntity()
    {

    }

    public ImageEntity(int imageID, int tourID, int providerID, int userID, byte[] imageData, String caption, String imageType, int statusID, int dbStatus, Date createdAt, Date updatedAt) {
        this.imageID = imageID;
        this.tourID = tourID;
        this.providerID = providerID;
        this.userID = userID;
        this.imageData = imageData;
        this.caption = caption;
        this.imageType = imageType;
        this.statusID = statusID;
        this.dbStatus = dbStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public int getProviderID() {
        return providerID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(int dbStatus) {
        this.dbStatus = dbStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

