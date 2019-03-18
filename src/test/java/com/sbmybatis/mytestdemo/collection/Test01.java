package com.sbmybatis.mytestdemo.collection;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Test01 {
    private static final Logger log= LoggerFactory.getLogger(Test01.class);
    private int sum=1024;
    private int a1=1;
    private int a4=4;
    private int a16=16;
    private int a64=64;

    public int  test1(int pay){
        int sum=1024;
        int shengyu=sum-pay;
        int num=0;
        if(shengyu<1)
            return num;
        if(shengyu<3)
            return shengyu;
        if(4<shengyu&&shengyu<16)
            return shengyu/4+shengyu%4;
        if(16<shengyu&&shengyu<64)
            return shengyu/16+shengyu%16/4+shengyu%16%4;
        return shengyu/64+shengyu%64/16+shengyu%64%16/4+shengyu%64%16%4;
    }
    public int   test2(int pay){

        return 1;
    }
}
