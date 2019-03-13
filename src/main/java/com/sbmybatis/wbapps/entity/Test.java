package com.sbmybatis.wbapps.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "text")
public class Test {
    private String tname;
    private int age;
//    @Value("${text.lit}")
    private List<Object> lit;
    private int[] a ;
    private Map<String,Object> map;
    private Patyten patyten;

    public Patyten getPatyten() {
        return patyten;
    }

    public void setPatyten(Patyten patyten) {
        this.patyten = patyten;
    }

    @Override
    public String toString() {
        return "Test{" +
                "tname='" + tname + '\'' +
                ", age=" + age +
                ", lit=" + lit +
                ", a=" + Arrays.toString(a) +
                ", map=" + map +
                ", patyten=" + patyten +
                '}';
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Object> getLit() {
        return lit;
    }

    public void setLit(List<Object> lit) {
        this.lit = lit;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
