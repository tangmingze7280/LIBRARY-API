package com.sbmybatis.wbapps.entity;

public class User{
    private Integer id;
    private String  uname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                '}';
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
