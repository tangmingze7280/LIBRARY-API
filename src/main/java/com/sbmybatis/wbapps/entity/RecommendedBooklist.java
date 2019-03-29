package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "recommended_booklist", schema = "baselibrary", catalog = "")
public class RecommendedBooklist {
    private int id;
    private int wechatUserId;
    private int booklistId;
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
    @Column(name = "wechat_user_id")
    public int getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(int wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    @Basic
    @Column(name = "booklist_id")
    public int getBooklistId() {
        return booklistId;
    }

    public void setBooklistId(int booklistId) {
        this.booklistId = booklistId;
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
        RecommendedBooklist that = (RecommendedBooklist) o;
        return id == that.id &&
                wechatUserId == that.wechatUserId &&
                booklistId == that.booklistId &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wechatUserId, booklistId, createdAt, updatedAt);
    }
}
