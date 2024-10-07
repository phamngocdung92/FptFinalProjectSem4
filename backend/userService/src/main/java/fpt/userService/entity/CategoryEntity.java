package fpt.userService.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Categories")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID", nullable = false)
    private Integer categoryId;

    @Column(name = "Name", nullable = false, unique = true)
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "StatusID", nullable = false)
    private Integer statusId;

    @Column(name = "dbStatus", nullable = false)
    private Integer dbStatus;

    @Column(name = "CreatedAt", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private LocalDateTime updatedAt;

    // Constructors
    public CategoryEntity() {
    }

    public CategoryEntity(String name, String description, Integer statusId, Integer dbStatus) {
        this.name = name;
        this.description = description;
        this.statusId = statusId;
        this.dbStatus = dbStatus;
    }

    // Getters and Setters
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Integer dbStatus) {
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
}
