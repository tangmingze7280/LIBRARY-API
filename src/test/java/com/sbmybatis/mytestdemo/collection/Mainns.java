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
}
