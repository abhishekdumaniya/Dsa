package com.abhishek.Sorting.SelectionSort;

import java.util.Arrays;

public class Just_SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,9,8,1,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum item in the remaining array and swap with correct position
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr , maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex (int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
