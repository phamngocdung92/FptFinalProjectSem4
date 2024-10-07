package fpt.userService.entity.log;

import jakarta.persistence.*;

@Entity
@Table(name = "Audit_Log")
public class AuditLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int logID;

    @Column(name = "EntityType", nullable = false)
    private String entityType;

    @Column(name = "EntityID", nullable = false)
    private int entityID;

    @Column(name = "ActionType", nullable = false)
    private String actionType;

    @Column(name = "PerformedByType", nullable = false)
    private String performedByType;

    @Column(name = "PerformedByID", nullable = false)
    private int performedByID;

    @Column(name = "PerformedAt", nullable = false)
    private java.util.Date performedAt;

    @Column(name = "BeforeData", columnDefinition = "TEXT")
    private String beforeData;

    @Column(name = "AfterData", columnDefinition = "TEXT")
    private String afterData;

    @Column(name = "AdditionalInfo", columnDefinition = "TEXT")
    private String additionalInfo;

    public AuditLogEntity(int entityID, String entityType, String actionType, String performedByType, int performedByID, java.util.Date performedAt, String beforeData, String afterData, String additionalInfo) {
        this.entityID = entityID;
        this.entityType = entityType;
        this.actionType = actionType;
        this.performedByType = performedByType;
        this.performedByID = performedByID;
        this.performedAt = performedAt;
        this.beforeData = beforeData;
        this.afterData = afterData;
        this.additionalInfo = additionalInfo;
    }

    // Getters and Setters
    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getPerformedByType() {
        return performedByType;
    }

    public void setPerformedByType(String performedByType) {
        this.performedByType = performedByType;
    }

    public int getPerformedByID() {
        return performedByID;
    }

    public void setPerformedByID(int performedByID) {
        this.performedByID = performedByID;
    }

    public java.util.Date getPerformedAt() {
        return performedAt;
    }

    public void setPerformedAt(java.util.Date performedAt) {
        this.performedAt = performedAt;
    }

    public String getBeforeData() {
        return beforeData;
    }

    public void setBeforeData(String beforeData) {
        this.beforeData = beforeData;
    }

    public String getAfterData() {
        return afterData;
    }

    public void setAfterData(String afterData) {
        this.afterData = afterData;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}

