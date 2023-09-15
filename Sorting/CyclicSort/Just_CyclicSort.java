package com.abhishek.Sorting.CyclicSort;

import java.util.Arrays;

public class Just_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3,6};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct] ){
                swape(arr, i, correct);
            }else {
                i++;
            }
        }
    }
    static void swape(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
