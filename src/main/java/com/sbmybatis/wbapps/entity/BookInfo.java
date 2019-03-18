package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.sql.Blob;

/**
 * @howToUser 图书详情
 * @date 2019/03/18
 */
@Entity
public class BookInfo {
    private Long id;//唯一标识码
    private String bookName;//图书名称
    private Long bkRepertory;//当前图书库存
    private String bookIntroduce;//图书简介
    private Blob bookUserCode;//图书被解除的详细信息{17853537280,wb0123} wx_code的 编码集合
    private Long bookUseredAmount;//图书总库存
    private String bookType;
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getBkRepertory() {
        return bkRepertory;
    }

    public void setBkRepertory(Long bkRepertory) {
        this.bkRepertory = bkRepertory;
    }

    public String getBookIntroduce() {
        return bookIntroduce;
    }

    public void setBookIntroduce(String bookIntroduce) {
        this.bookIntroduce = bookIntroduce;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.EAGER )//急加载
    public Blob getBookUserCode() {
        return bookUserCode;
    }

    public void setBookUserCode(Blob bookUserCode) {
        this.bookUserCode = bookUserCode;
    }

    public Long getBookUseredAmount() {
        return bookUseredAmount;
    }

    public void setBookUseredAmount(Long bookUseredAmount) {
        this.bookUseredAmount = bookUseredAmount;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bkRepertory=" + bkRepertory +
                ", bookIntroduce='" + bookIntroduce + '\'' +
                ", bookUserCode=" + bookUserCode +
                ", bookUseredAmount=" + bookUseredAmount +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
