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

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= 2) {
                System.out.println("Result: true");
                System.out.println("Число" + entry.getKey() + " повторяется " + entry.getValue() + " раза");
            }
        }
        System.out.println("Дубликатов нет");
    }


    public static void main(String[] args) {
//        int[] array = {1, 6, 8, 9, 15, 2};
//        int target = 17;
//        find(array, target);

        int[] arr2 = {1, 2, 4, 5};
        int[] arr1 = {1, 1, 2, 3, 9, 3};
        findDuplicates(arr2);

    }

}
