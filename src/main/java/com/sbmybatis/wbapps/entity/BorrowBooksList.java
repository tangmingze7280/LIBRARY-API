package com.sbmybatis.wbapps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BorrowBooksList  {

    private Long id;
    private Long bookId ;//BookInfo的id
    private String wxCode;//关联微信号  默认同一种书只能借一种
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    @Column
    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    @Override
    public String toString() {
        return "BorrowBooksList{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", wxCode='" + wxCode + '\'' +
                '}';
    }
}
