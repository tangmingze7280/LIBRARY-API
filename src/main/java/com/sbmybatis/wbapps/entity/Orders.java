package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Orders {
    private int id;
    private int status;
    private String wechatUserId;
    private String isbn;
    private int libraryId;
    private Date shouldTakeTime;
    private String actualTakeTime;
    private Integer renewCount;
    private String shouldReturnTime;
    private String actualReturnTime;
    private double fine;
    private int isFinePaied;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id")
    @GeneratedValue
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
    @Column(name = "wechat_user_id")
    public String getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(String wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    @Basic
    @Column(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "library_id")
    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    @Basic
    @Column(name = "should_take_time")
    public Date getShouldTakeTime() {
        return shouldTakeTime;
    }

    public void setShouldTakeTime(Date shouldTakeTime) {
        this.shouldTakeTime = shouldTakeTime;
    }

    @Basic
    @Column(name = "actual_take_time")
    public String getActualTakeTime() {
        return actualTakeTime;
    }

    public void setActualTakeTime(String actualTakeTime) {
        this.actualTakeTime = actualTakeTime;
    }

    @Basic
    @Column(name = "renew_count")
    public Integer getRenewCount() {
        return renewCount;
    }

    public void setRenewCount(Integer renewCount) {
        this.renewCount = renewCount;
    }

    @Basic
    @Column(name = "should_return_time")
    public String getShouldReturnTime() {
        return shouldReturnTime;
    }

    public void setShouldReturnTime(String shouldReturnTime) {
        this.shouldReturnTime = shouldReturnTime;
    }

    @Basic
    @Column(name = "actual_return_time")
    public String getActualReturnTime() {
        return actualReturnTime;
    }

    public void setActualReturnTime(String actualReturnTime) {
        this.actualReturnTime = actualReturnTime;
    }

    @Basic
    @Column(name = "fine")
    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Basic
    @Column(name = "is_fine_paied")
    public int getIsFinePaied() {
        return isFinePaied;
    }

    public void setIsFinePaied(int isFinePaied) {
        this.isFinePaied = isFinePaied;
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

    @Basic
    @Column(name = "deleted_at")
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return id == orders.id &&
                status == orders.status &&
                wechatUserId == orders.wechatUserId &&
                libraryId == orders.libraryId &&
                Double.compare(orders.fine, fine) == 0 &&
                isFinePaied == orders.isFinePaied &&
                Objects.equals(isbn, orders.isbn) &&
                Objects.equals(shouldTakeTime, orders.shouldTakeTime) &&
                Objects.equals(actualTakeTime, orders.actualTakeTime) &&
                Objects.equals(renewCount, orders.renewCount) &&
                Objects.equals(shouldReturnTime, orders.shouldReturnTime) &&
                Objects.equals(actualReturnTime, orders.actualReturnTime) &&
                Objects.equals(createdAt, orders.createdAt) &&
                Objects.equals(updatedAt, orders.updatedAt) &&
                Objects.equals(deletedAt, orders.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, wechatUserId, isbn, libraryId, shouldTakeTime, actualTakeTime, renewCount, shouldReturnTime, actualReturnTime, fine, isFinePaied, createdAt, updatedAt, deletedAt);
    }
}
