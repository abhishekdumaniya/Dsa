package com.abhishek.Array;

import java.util.Arrays;

public class Non_Decreasingarray {
    public static void main(String[] args) {
        int[] arr = {4,2,1};
         System.out.println(check(arr));
    }
    static boolean check(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                
                if (nums[j] >= nums[j-1]){
                    return true;
                }
            }
        }
        return false;
    }
}
