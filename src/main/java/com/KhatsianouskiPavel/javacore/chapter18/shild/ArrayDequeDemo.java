package com.KhatsianouskiPavel.javacore.chapter18.shild;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.add("A");
        adq.add("B");
        adq.add("D");
        adq.add("E");
        adq.add("F");

        System.out.println("Izvle4enie iz steka: ");

        while(adq.peek() != null) {
            System.out.println(adq.pop() + " ");
        }

        System.out.println();
    }
}
