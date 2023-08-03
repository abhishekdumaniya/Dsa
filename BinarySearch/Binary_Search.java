package com.abhishek.BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,5,8,16,20,28,39,45,85};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The target is 45");
        int target = 45;
        int ans = binary(arr, target);
        System.out.println("an index is: " +ans);
    }
    // return the array
    // return -1 if it is not exit
    static int binary(int[] arr,int target){
        int start  = 0;
        int end = arr.length-1;
        while (start <= end){
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        // target is a not find in an array
        return -1;
    }
}
