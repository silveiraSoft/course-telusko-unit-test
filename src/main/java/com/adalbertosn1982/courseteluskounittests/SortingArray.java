package com.adalbertosn1982.courseteluskounittests;

import java.util.Arrays;

public class SortingArray {

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArray2(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] nTimeSortingArray2(int[] arr) {
        for(int i = 0; i < 100000; i++) {
            Arrays.sort(arr);
        }
        return arr;
    }

    public static int[] sortArraySendingException(int[] arr) throws Exception {
        throw new Exception("Error");
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        int[] sortedArr = sortArray2(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

}
