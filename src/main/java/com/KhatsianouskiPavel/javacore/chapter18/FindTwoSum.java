package com.KhatsianouskiPavel.javacore.chapter18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTwoSum {

    public static int[] findTwoSum(int[] arr, int target) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            indexMap.put(arr[i], i);
        }

        int left = 0, right = sortedArr.length - 1;
        while (left < right) {
            int sum = sortedArr[left] + sortedArr[right];
            if (sum == target) {

                return new int[]{indexMap.get(sortedArr[left]), indexMap.get(sortedArr[right])};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] arrr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrr1 = {10, 50, 90, 20, 30, 45, 99, 77};

        int[] array = {3, 8, 15, 17};
        int target = 40;
        int[] result = findTwoSum(arrr1, target);
        System.out.println("result = [" + result[0] + ", " + result[1] + "]");
    }
}
