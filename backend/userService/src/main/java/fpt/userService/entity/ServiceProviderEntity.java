package fpt.userService.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Service_Providers")
public class ServiceProviderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProviderID", nullable = false, updatable = false)
    private Integer providerID;

    @Column(name = "CompanyName", nullable = false, unique = true)
    private String companyName;

    @Column(name = "CompanyRegistrationNumber", nullable = false, unique = true)
    private String companyRegistrationNumber;

    @Column(name = "TaxID", nullable = false, unique = true)
    private String taxID;

    @Column(name = "CompanyAddress", nullable = false)
    private String companyAddress;

    @Column(name = "ContactPerson", nullable = false)
    private String contactPerson;

    @Column(name = "ContactEmail", nullable = false, unique = true)
    private String contactEmail;

    @Column(name = "ContactPhone", nullable = false)
    private String contactPhone;

    @Column(name = "Website")
    private String website;

    @Column(name = "CompanyDescription")
    private String companyDescription;

    @Column(name = "LogoURL")
    private String logoURL;

    @Column(name = "SocialMediaLinks")
    private String socialMediaLinks;

    @Column(name = "BankAccountNumber")
    private String bankAccountNumber;

    @Column(name = "BankName")
    private String bankName;

    @Column(name = "BankBranch")
    private String bankBranch;

    @Column(name = "LicenseDocumentURL")
    private String licenseDocumentURL;

    @Column(name = "StatusID", nullable = false)
    private Integer statusID;

    @Column(name = "dbStatus", nullable = false)
    private Integer dbStatus;

    @Column(name = "RejectionReason")
    private String rejectionReason;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CreatedAt", nullable = false, updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UpdatedAt", nullable = false)
    private Date updatedAt;

    // Getters and Setters
    public Integer getProviderID() {
        return providerID;
    }

    public void setProviderID(Integer providerID) {
        this.providerID = providerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(String socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getLicenseDocumentURL() {
        return licenseDocumentURL;
    }

    public void setLicenseDocumentURL(String licenseDocumentURL) {
        this.licenseDocumentURL = licenseDocumentURL;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public Integer getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Integer dbStatus) {
        this.dbStatus = dbStatus;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
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

