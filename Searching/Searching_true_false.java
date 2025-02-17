package com.abhishek.Searching;

public class Searching_true_false {
    public static void main(String[] args) {
        int[] nums = {12,45,78,1,32,-5,-4,56};
        int target = -5;
        boolean ans = linersearching(nums , target);
            System.out.println(ans);
        }
    static boolean linersearching(int[] arr, int target) {
        if (target == 0) {
            return false;
        }
        // for loop for a all element in an array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return true;
            }
        }
        // Target is a not a found
        return false;
    }
}
