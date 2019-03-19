package com.sbmybatis.wbapps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @howw  图书分类表
 * @date 2019/03/18
 */
@Entity
public class BookType {

    private Long id;
    private String bkType;//图书类型
    private String tpyCode;//类型编号
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBkType() {
        return bkType;
    }

    public void setBkType(String bkType) {
        this.bkType = bkType;
    }

    public String getTpyCode() {
        return tpyCode;
    }

    public void setTpyCode(String tpyCode) {
        this.tpyCode = tpyCode;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "id=" + id +
                ", bkType='" + bkType + '\'' +
                ", tpyCode='" + tpyCode + '\'' +
                '}';
    }
}
