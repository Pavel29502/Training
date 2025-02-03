package com.KhatsianouskiPavel.javacore.chapter18;

import java.util.*;

public class Method {
    public static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findTwoSum(int[] arr, int target) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        int left = 0, right = newArr.length - 1;
        while (left < right) {
            int sum = newArr[left] + newArr[right];
            if (sum == target) {
                int leftIndex = findIndex(arr, newArr[left]);
                int rightIndex = findIndex(arr, newArr[right]);
                System.out.println("rezult = [" + leftIndex + ", " + rightIndex + "]");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }


    public static void findDuplicate(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (map.containsKey(element)) {
                List<Integer> integers = map.get(element);
                integers.add(i);
            } else {
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                map.put(element, indexes);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Число" + entry.getKey() + " повторяется в индексах" + entry.getValue());

            }
        }
    }
}


