package com.sbmybatis.mytestdemo.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Mainns {
    @Test
    public void test1(){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<3;i++)
            list.add(i);
        System.out.println(list.size());
        for(Integer i:list.subList(0,5))
            System.out.println(i);

    }
    @Test
    public void  test2(){
        xax();

    }
    public int xax(){
        try {
            throw new RuntimeException();
        }catch(Exception e){
            e.printStackTrace();
            return 2;
        }finally{
            System.out.println(12121);
        }
    }
}
