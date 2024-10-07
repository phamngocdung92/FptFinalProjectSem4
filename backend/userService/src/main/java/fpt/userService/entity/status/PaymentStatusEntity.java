package fpt.userService.entity.status;

import jakarta.persistence.*;
@Entity
@Table(name = "PaymentStatus")
public class PaymentStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusID;

    @Column(name = "StatusName", nullable = false, unique = true)
    private String statusName;

    public PaymentStatusEntity(int statusID, String statusName) {
        this.statusID = statusID;
        this.statusName = statusName;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}

