package fpt.userService.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewID;

    @Column(name = "UserID", nullable = false)
    private int userID;

    @Column(name = "TourID", nullable = false)
    private int tourID;

    @Column(name = "Rating", nullable = false)
    private byte rating;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "StatusID", nullable = false)
    private int statusID;

    @Column(name = "dbStatus", nullable = false)
    private int dbStatus;

    @Column(name = "CreatedAt", nullable = false)
    private Date createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private Date updatedAt;

    public ReviewEntity()
    {

    }

    public ReviewEntity(int reviewID, int userID, int tourID, byte rating, String comment, int statusID, int dbStatus, Date createdAt, Date updatedAt) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.tourID = tourID;
        this.rating = rating;
        this.comment = comment;
        this.statusID = statusID;
        this.dbStatus = dbStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

