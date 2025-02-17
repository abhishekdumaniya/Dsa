package com.abhishek.Searching;

public class Searching_Range {
    public static void main(String[] args) {
        int[] arr = {1,25,45,-5,-448,8,45};
        int target = 45;
        System.out.println(liner(arr,target,1,4));
    }
    static int liner(int[] arr,int target, int start,int end){
        if (target == arr.length){
            System.out.println("Target not a found");
        }
        // For every element to cheak
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (target == element){
                System.out.println("The element is found in index:"+i);
                return 0;
            }
        }
        // Number is not a found
        return -1;
    }

}
