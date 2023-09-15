package com.abhishek.Sorting.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Just_InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter an element: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(nums));
        System.out.println();
        System.out.println("Using Insertion sort the sorted array is below : --->");
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
