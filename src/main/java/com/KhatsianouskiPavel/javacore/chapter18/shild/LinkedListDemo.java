package com.KhatsianouskiPavel.javacore.chapter18.shild;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Ishodnoe soderjimoe sv9znogo spiska ll: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("Soderjimoe sv9znogo spiska ll " + "posle ydaleni9 elementov: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Soderjimoe sv9znogo spiska ll posle ydaleni9 " + "pervogo i poslednego elementov: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " izmeneno");

        System.out.println("Soderjimoe sv9znogo spiska ll posle izmeneni9: " + ll);
    }
}
