package com.abhishek.Sorting.MergeSort;

import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};
        mergesortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergesortInplace(int[] arr, int start, int end){
        if (end - start == 1){
            return ;
        }
        int mid = start + (end - start) / 2;
        mergesortInplace(arr,start,mid);
        mergesortInplace(arr,mid,end);

        mergeinplace(arr,start,mid,end);
    }
    static void mergeinplace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];

        int i = start; //for a first an array
        int j = mid; //for a second an array
        int k = 0; //Merge both array

        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //It me be possible one of the arrays is not complete
        //copy the remaining element
        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];

        }
    }
}
