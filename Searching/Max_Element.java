package com.abhishek.Searching;

public class Max_Element {
    public static void main(String[] args) {
        int[] num = {1,5,8,2,-1,9,98,56};
        System.out.println(max(num));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
