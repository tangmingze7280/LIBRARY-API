package com.sbmybatis.wbapps.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Libraries {
    private int id;
    private int status;
    private String reviewMsg;
    private String name;
    private String phone;
    private String address;
    private String introduction;
    private String photos;
    private String qualifications;
    private String adminPhone;
    private String adminName;
    private String adminPassword;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "review_msg")
    public String getReviewMsg() {
        return reviewMsg;
    }

    public void setReviewMsg(String reviewMsg) {
        this.reviewMsg = reviewMsg;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "photos")
    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @Basic
    @Column(name = "qualifications")
    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    @Basic
    @Column(name = "admin_phone")
    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    @Basic
    @Column(name = "admin_name")
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "admin_password")
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libraries libraries = (Libraries) o;
        return id == libraries.id &&
                status == libraries.status &&
                Objects.equals(reviewMsg, libraries.reviewMsg) &&
                Objects.equals(name, libraries.name) &&
                Objects.equals(phone, libraries.phone) &&
                Objects.equals(address, libraries.address) &&
                Objects.equals(introduction, libraries.introduction) &&
                Objects.equals(photos, libraries.photos) &&
                Objects.equals(qualifications, libraries.qualifications) &&
                Objects.equals(adminPhone, libraries.adminPhone) &&
                Objects.equals(adminName, libraries.adminName) &&
                Objects.equals(adminPassword, libraries.adminPassword) &&
                Objects.equals(createdAt, libraries.createdAt) &&
                Objects.equals(updatedAt, libraries.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, reviewMsg, name, phone, address, introduction, photos, qualifications, adminPhone, adminName, adminPassword, createdAt, updatedAt);
    }
}
