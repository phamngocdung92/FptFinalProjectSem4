package fpt.userService.entity.log;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin_Actions")
public class AdminActionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actionID;

    @Column(name = "AdminID", nullable = false)
    private int adminID;

    @Column(name = "ActionType", nullable = false)
    private String actionType;

    @Column(name = "ActionDetails", columnDefinition = "TEXT")
    private String actionDetails;

    @Column(name = "ActionTime", nullable = false)
    private java.util.Date actionTime;

    public AdminActionEntity(int adminID, String actionType, String actionDetails, java.util.Date actionTime) {
        this.adminID = adminID;
        this.actionType = actionType;
        this.actionDetails = actionDetails;
        this.actionTime = actionTime;
    }

    // Getters and Setters
    public int getActionID() {
        return actionID;
    }

    public void setActionID(int actionID) {
        this.actionID = actionID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(String actionDetails) {
        this.actionDetails = actionDetails;
    }

    public java.util.Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(java.util.Date actionTime) {
        this.actionTime = actionTime;
    }
}

