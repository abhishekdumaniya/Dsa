package com.abhishek.Searching;

public class Min_ELement {
    public static void main(String[] args) {
        int[] num = {12,45,-9,78,45,12,-6};
        System.out.println(min(num));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
