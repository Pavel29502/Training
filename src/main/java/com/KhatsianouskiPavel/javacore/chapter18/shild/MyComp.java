package com.KhatsianouskiPavel.javacore.chapter18.shild;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);

//    public int compare(String aStr, String bStr) {
//        return aStr.compareTo(bStr);

        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet<>(mc.reversed());
    }
}

