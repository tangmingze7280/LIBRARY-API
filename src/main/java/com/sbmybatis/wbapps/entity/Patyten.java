package com.sbmybatis.wbapps.entity;

public class Patyten {
    private String flag;

    @Override
    public String toString() {
        return "Patyten{" +
                "flag='" + flag + '\'' +
                '}';
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
