package fpt.userService.dto.tour;

import fpt.userService.entity.TourEntity;

import java.util.Date;

public class TourDto {

    private int tourID;
    private int providerID;
    private int categoryID;
    private int locationID;
    private String name;
    private String description;
    private double price;
    private String duration;
    private int availableSlots;
    private int mainImageID;
    private int statusID;
    private int dbStatus;
    private Date createdAt;
    private Date updatedAt;

    public TourDto() {
    }

    public TourDto(int tourID, int providerID, int categoryID, int locationID, String name, String description, double price, String duration, int availableSlots, int mainImageID, int statusID, int dbStatus, Date createdAt, Date updatedAt) {
        this.tourID = tourID;
        this.providerID = providerID;
        this.categoryID = categoryID;
        this.locationID = locationID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.availableSlots = availableSlots;
        this.mainImageID = mainImageID;
        this.statusID = statusID;
        this.dbStatus = dbStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }

    public int getMainImageID() {
        return mainImageID;
    }

    public void setMainImageID(int mainImageID) {
        this.mainImageID = mainImageID;
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

    public TourEntity toTourEntity(){
        TourEntity entity = new TourEntity();
        entity.setTourID(this.tourID);
        entity.setProviderID(this.providerID);
        entity.setCategoryID(this.categoryID);
        entity.setLocationID(this.locationID);
        entity.setName(this.name);
        entity.setDescription(this.description);
        entity.setPrice(this.price);
        entity.setDuration(this.duration);
        entity.setAvailableSlots(this.availableSlots);
        entity.setMainImageID(this.mainImageID);
        entity.setStatusID(this.statusID);
        entity.setDbStatus(this.dbStatus);
        entity.setCreatedAt(this.createdAt);
        entity.setUpdatedAt(this.updatedAt);

        return entity;
    }
}