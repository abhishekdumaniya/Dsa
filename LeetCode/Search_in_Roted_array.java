package com.abhishek.LeetCode;

public class Search_in_Roted_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
    static int search(int[] arr, int target){
    int n = arr.length;
    int start = 0;
    int end = n  - 1;

        while(start <= end) {
        int mid = (start + end) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        // checks if we are in the left side of sorted array
        if(arr[start] <= arr[mid]) {

            // combined both the logic
            if(target > arr[mid] || target < arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // checks if we are in the right side of sorted array
        else {
            if(target < arr[mid] || target > arr[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
        return -1;
    }
}
