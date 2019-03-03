package com.sbmybatis.wbapps.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private int age;
    private String[] wtf;
    private List<Object> lit;
    private boolean flag;
    private Date time;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getWtf() {
        return wtf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", wtf=" + Arrays.toString(wtf) +
                ", lit=" + lit +
                ", flag=" + flag +
                ", time=" + time +
                '}';
    }

    public void setWtf(String[] wtf) {
        this.wtf = wtf;
    }

    public List<Object> getLit() {
        return lit;
    }

    public void setLit(List<Object> lit) {
        this.lit = lit;
    }
}
