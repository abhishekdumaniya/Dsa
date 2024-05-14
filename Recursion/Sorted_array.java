package com.abhishek.Recursion;

public class Sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        System.out.println(sort(arr,0));
    }
    static boolean sort(int[] arr, int index){
        //Base condition
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sort(arr,index + 1);
    }
}
