package com.KhatsianouskiPavel.javacore.chapter18.shild;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Начальный размер списочного массива al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Razmer massiva al posle vvoda elementov: " + al.size());

        System.out.println("Soderjimoe spiso4nogo massiva al: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Razmer spiso4nogo massiva al posle ydaleni9 elementov: " + al.size());
        System.out.println("Soderjimoe spiso4nogo massiva al: " + al);
    }
}
