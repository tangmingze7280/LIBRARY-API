package com.sbmybatis.mytestdemo.xmlreader;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public final static String YES = "Yes";
    public final static String NO = "No";

    public static void main(String args[]) {
        /*Scanner san=new Scanner(System.in);
        String x= "hhbbcc";
        String a= "aabbcc";
        System.out.println();//97-122*/
        List<Integer> aim = new ArrayList<>();
        aim.add(1);
        aim.add(2);
        aim.add(3);
        aim.add(4);
        aim.add(5);
        System.out.println(test(aim));
    }

    public static boolean test(List<Integer> aim) {
        int x = 0;
        if (aim.size() < 3)
            return true;
        int firnum = aim.get(0);
        int lastnum = aim.get(aim.size() - 1);
        int midnum = aim.get((aim.size() - 1) / 2);
        if (firnum < midnum && lastnum > midnum)
            return true;

        return checkNumArr(aim, x);
    }

    public static boolean checkNumArr(List<Integer> aim, int x) {
        List<Integer> soru = aim;
        soru.remove(x);
        if (x != aim.size()) {
            if (test(soru))
                return true;
            else
                checkNumArr(aim, ++x);
        }
        return false;

    }
    public static boolean ches(List<Integer> aim){
        if (aim.size() < 3)
            return true;
        int firnum = aim.get(0);
        int lastnum = aim.get(aim.size() - 1);
        int midnum = aim.get((aim.size() - 1) / 2);
        if (firnum < midnum && lastnum > midnum)
            return true;
        else
            return false;
    }

}
