package com.sbmybatis.wbapps.bean;

import java.util.Objects;

public class RistBookMap {
    private Integer id;
    private Integer status;
    private String isbn;
    private String actualReturnTime;
    private String bookName;

    public RistBookMap(Integer id, Integer status, String isbn, String actualReturnTime, String bookName) {
        this.id = id;
        this.status = status;
        this.isbn = isbn;
        this.actualReturnTime = actualReturnTime;
        this.bookName = bookName;
    }

    public RistBookMap() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getActualReturnTime() {
        return actualReturnTime;
    }

    public void setActualReturnTime(String actualReturnTime) {
        this.actualReturnTime = actualReturnTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RistBookMap that = (RistBookMap) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(status, that.status) &&
                Objects.equals(isbn, that.isbn) &&
                Objects.equals(actualReturnTime, that.actualReturnTime) &&
                Objects.equals(bookName, that.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, isbn, actualReturnTime, bookName);
    }

    @Override
    public String toString() {
        return "RistBookMap{" +
                "id=" + id +
                ", status=" + status +
                ", isbn='" + isbn + '\'' +
                ", actualReturnTime='" + actualReturnTime + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
