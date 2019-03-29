package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "booklist_wechat_user", schema = "baselibrary", catalog = "")
@IdClass(BooklistWechatUserPK.class)
public class BooklistWechatUser {
    private int booklistId;
    private int wechatUserId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "booklist_id")
    public int getBooklistId() {
        return booklistId;
    }

    public void setBooklistId(int booklistId) {
        this.booklistId = booklistId;
    }

    @Id
    @Column(name = "wechat_user_id")
    public int getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(int wechatUserId) {
        this.wechatUserId = wechatUserId;
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
        BooklistWechatUser that = (BooklistWechatUser) o;
        return booklistId == that.booklistId &&
                wechatUserId == that.wechatUserId &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booklistId, wechatUserId, createdAt, updatedAt);
    }
}
