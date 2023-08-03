package com.abhishek.BinarySearch;
// Ascending and descending order
public class Order_Argostics {
    public static void main(String[] args) {
        //Array is sorted in an ascending
        int[] nums = {-1,0,1,2,5,9,15,65,88,99,121};
        //Array is sorted in a descending
        int[] arr = {99,88,55,22,14,13,12,8,5,2,1,-1,-3,-5};
        int target = 5;
//        System.out.println(binarysearch(nums,target));
        System.out.println(binarysearch(arr,target));
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // FInd the array is sorted in ascending or descending
        boolean ascending = arr[start] < arr[end];  // Same as a below if-else condition
//        if (arr[start] < arr[end]){
//            ascending = true
//        }else {
//            ascending = false;
//        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        //Not a found element in an array
        return -1;
    }
}