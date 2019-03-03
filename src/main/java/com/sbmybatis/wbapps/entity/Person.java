package com.sbmybatis.wbapps.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private int age;
    private String[] wtf;
    private List<Object> lit;

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
