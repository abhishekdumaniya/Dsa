package com.abhishek.Function;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        int arr[] ={1,5,8,7,5,87};
        System.out.println(Arrays.toString(arr));
        System.out.println("Change the value of an index number 0");
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 55;
    }
}
