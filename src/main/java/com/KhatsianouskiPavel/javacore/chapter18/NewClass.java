package com.KhatsianouskiPavel.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;

public class NewClass {
    public static void find(int[] arr, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int firstIndex = target - arr[i];

            if (indexMap.containsKey(firstIndex)) {
//                System.out.println(firstIndex + " " + arr[i]);
//                int secondIndex = i;
                System.out.println(indexMap.get(firstIndex) + " " + i);
            } else {
                indexMap.put(arr[i], i);
            }
        }
//        System.out.println("Нет нужных чисел");
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 8, 9, 15, 2};
        int target = 17;
        find(array, target);
    }
}
