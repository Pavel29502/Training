package com.KhatsianouskiPavel.javacore.chapter18.shild;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Soderjimoe spiso4nogo massiva al: " + al);

        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        for(int i : ia) sum += i;

        System.out.println("Summa: " + sum);

    }
}
