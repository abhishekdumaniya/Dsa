package com.abhishek.Sorting.BubleSort;

import java.util.Arrays;

public class Just_BubleSort {
    public static void main(String[] args) {
        int[] nums = {5,9,7,6,3};
        System.out.println(Arrays.toString(nums));
        System.out.println();
        System.out.println("The buble sorting is below ------>>");
        bublesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bublesort(int[] arr){
       // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] <= arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
