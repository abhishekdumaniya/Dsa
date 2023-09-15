package com.abhishek.Sorting.QuickSort;

import java.util.Arrays;

public class Just_QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 49, 5, 15, 415, 8};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        int l = low;
        int h = high;
        while (l <= h) {
            while (nums[l] < pivot) {
                l++;
            }
            while (nums[h] > pivot) {
                h--;
            }
                if (l <= h) {
                    int temp = nums[l];
                    nums[l] = nums[h];
                    nums[h] = temp;
                    l++;
                    h--;
                }
            }
        quick(nums, low, h);
        quick(nums, l, high);
        }
    }


