package com.abhishek.LeetCode;

import java.util.Arrays;

public class First_and_LastPosition_Of_element {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,8,8,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            //Find a middle element
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return new int[]{mid};
            } if (target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // target is not found
        return new int[]{-1,-1};
    }
}
