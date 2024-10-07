package fpt.userService.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentID;

    @Column(name = "BookingID", unique = true, nullable = false)
    private int bookingID;

    @Column(name = "PaymentMethod", nullable = false)
    private String paymentMethod;

    @Column(name = "StatusID", nullable = false)
    private int statusID;

    @Column(name = "dbStatus", nullable = false)
    private int dbStatus;

    @Column(name = "PaymentDate")
    private Date paymentDate;

    @Column(name = "Amount", nullable = false)
    private double amount;

    @Column(name = "CreatedAt", nullable = false)
    private Date createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private Date updatedAt;

    public PaymentEntity()
    {

    }

    public PaymentEntity(int paymentID, int bookingID, String paymentMethod, int statusID, int dbStatus, Date paymentDate, double amount, Date createdAt, Date updatedAt) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.paymentMethod = paymentMethod;
        this.statusID = statusID;
        this.dbStatus = dbStatus;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
