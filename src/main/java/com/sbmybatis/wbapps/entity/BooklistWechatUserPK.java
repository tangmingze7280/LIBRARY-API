package com.sbmybatis.wbapps.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class BooklistWechatUserPK implements Serializable {
    private int booklistId;
    private int wechatUserId;

    @Column(name = "booklist_id")
    @Id
    public int getBooklistId() {
        return booklistId;
    }

    public void setBooklistId(int booklistId) {
        this.booklistId = booklistId;
    }

    @Column(name = "wechat_user_id")
    @Id
    public int getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(int wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooklistWechatUserPK that = (BooklistWechatUserPK) o;
        return booklistId == that.booklistId &&
                wechatUserId == that.wechatUserId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(booklistId, wechatUserId);
    }
}
