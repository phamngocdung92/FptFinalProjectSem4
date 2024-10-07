package fpt.userService.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Bookings")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingID;

    @Column(name = "UserID", nullable = false)
    private int userID;

    @Column(name = "TourID", nullable = false)
    private int tourID;

    @Column(name = "BookingDate", nullable = false)
    private Date bookingDate;

    @Column(name = "StatusID", nullable = false)
    private int statusID;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "ContactName")
    private String contactName;

    @Column(name = "dbStatus", nullable = false)
    private int dbStatus;

    @Column(name = "PaymentID")
    private int paymentID;

    @Column(name = "CreatedAt", nullable = false)
    private Date createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private Date updatedAt;

    public BookingEntity()
    {

    }

    public BookingEntity(int bookingID, int userID, int tourID, Date bookingDate, int statusID, String phoneNumber, String contactName, int dbStatus, int paymentID, Date createdAt, Date updatedAt) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.tourID = tourID;
        this.bookingDate = bookingDate;
        this.statusID = statusID;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
        this.dbStatus = dbStatus;
        this.paymentID = paymentID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
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

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(int dbStatus) {
        this.dbStatus = dbStatus;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
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

