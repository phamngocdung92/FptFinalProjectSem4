package fpt.userService.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tours")
public class TourEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tourID;

    @Column(name = "ProviderID", nullable = false)
    private int providerID;

    @Column(name = "CategoryID", nullable = false)
    private int categoryID;

    @Column(name = "LocationID", nullable = false)
    private int locationID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price", nullable = false)
    private double price;

    @Column(name = "Duration", nullable = false)
    private String duration;

    @Column(name = "StartDate", nullable = false)
    private Date startDate;

    @Column(name = "EndDate", nullable = false)
    private Date endDate;

    @Column(name = "AvailableSlots", nullable = false)
    private int availableSlots;

    @Column(name = "MainImageID")
    private int mainImageID;

    @Column(name = "StatusID", nullable = false)
    private int statusID;

    @Column(name = "dbStatus", nullable = false)
    private int dbStatus;

    @Column(name = "CreatedAt", nullable = false)
    private Date createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private Date updatedAt;

    public TourEntity()
    {

    }

    public TourEntity(int tourID, int providerID, int categoryID, int locationID, String name, String description, double price, String duration, Date startDate, Date endDate, int availableSlots, int mainImageID, int statusID, int dbStatus, Date createdAt, Date updatedAt) {
        this.tourID = tourID;
        this.providerID = providerID;
        this.categoryID = categoryID;
        this.locationID = locationID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
}

