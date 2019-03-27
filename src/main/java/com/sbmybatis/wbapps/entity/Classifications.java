package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Classifications {
    private String number;
    private String name;
    private String sonNumber;
    private String parentNumber;
    private String nextNumber;
    @Temporal(TemporalType.DATE)
    private Date createdTime;
    @Id
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Column(length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSonNumber() {
        return sonNumber;
    }

    public void setSonNumber(String sonNumber) {
        this.sonNumber = sonNumber;
    }

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public String getNextNumber() {
        return nextNumber;
    }

    public void setNextNumber(String nextNumber) {
        this.nextNumber = nextNumber;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Classifications{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", sonNumber='" + sonNumber + '\'' +
                ", parentNumber='" + parentNumber + '\'' +
                ", nextNumber='" + nextNumber + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}
