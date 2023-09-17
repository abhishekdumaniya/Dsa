package com.abhishek.Recursion;

public class Buble_sort {
    public static void main(String[] args) {
            int[] arr = {1,5,8,6,2,4,5};
            buble(arr,0,0);
    }

    static void buble(int[]arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            buble(arr,r,c+1);
        } else {
            buble(arr,r-1,0);
        }
    }
}