package com.sbmybatis.wbapps.bean;

import java.util.Objects;

public class RistBookMap {
    private Integer id;
    private Integer status;
    private String isbn;
    private String actualReturnTime;
    private String bookName;
    private Integer finePaied;

    public Integer getId() {
        return id;
    }

    public RistBookMap(Integer id, Integer status, String isbn, String actualReturnTime, String bookName) {
        this.id = id;
        this.status = status;
        this.isbn = isbn;
        this.actualReturnTime = actualReturnTime;
        this.bookName = bookName;
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

    public Integer getFinePaied() {
        return finePaied;
    }

    public void setFinePaied(Integer finePaied) {
        this.finePaied = finePaied;
    }

    public RistBookMap() {
    }

    public RistBookMap(Integer id, Integer status, String isbn, String actualReturnTime, String bookName, Integer finePaied) {
        this.id = id;
        this.status = status;
        this.isbn = isbn;
        this.actualReturnTime = actualReturnTime;
        this.bookName = bookName;
        this.finePaied = finePaied;
    }

    @Override
    public String toString() {
        return "RistBookMap{" +
                "id=" + id +
                ", status=" + status +
                ", isbn='" + isbn + '\'' +
                ", actualReturnTime='" + actualReturnTime + '\'' +
                ", bookName='" + bookName + '\'' +
                ", finePaied=" + finePaied +
                '}';
    }
}
