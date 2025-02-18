package com.KhatsianouskiPavel.javacore.chapter18.shild;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {


        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dow", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = hm.get("John Dow");
        hm.put("John Dow", balance + 1000);
        System.out.println("Novii ostatok na s4ete John Dow: " + hm.get("John Dow"));
    }
}
