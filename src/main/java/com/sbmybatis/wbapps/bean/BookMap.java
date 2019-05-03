package com.sbmybatis.wbapps.bean;

import java.io.Serializable;

public class BookMap implements Serializable {
    public BookMap() {
    }

    public BookMap(String wxCode, String bookCode) {
        this.wxCode = wxCode;
        this.bookCode = bookCode;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private String wxCode;
    private String bookCode;

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
}
