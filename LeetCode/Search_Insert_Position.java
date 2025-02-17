package com.abhishek.LeetCode;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(search(arr,2));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            //Find a Mid
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
