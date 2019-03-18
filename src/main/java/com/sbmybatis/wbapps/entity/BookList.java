package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class BookList {

    private Long id;
    private String bkListName;//书单名字
    private Blob bkListHave;//书单拥有的书籍 这里 {book_code,book_code,book_code}
    private String wxCode;
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBkListName() {
        return bkListName;
    }

    public void setBkListName(String bkListName) {
        this.bkListName = bkListName;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.EAGER )//急加载
    public Blob getBkListHave() {
        return bkListHave;
    }

    public void setBkListHave(Blob bkListHave) {
        this.bkListHave = bkListHave;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "id=" + id +
                ", bkListName='" + bkListName + '\'' +
                ", bkListHave='" + bkListHave + '\'' +
                ", wxCode='" + wxCode + '\'' +
                '}';
    }
}
