package com.abhishek.LeetCode;
// https://leetcode.com/problems/missing-number/
public class Find_Missing_Number {
    public static void main(String[] args) {
    int[] arr = {4,0,2,1};
        System.out.println(missingnumber(arr));
    }

    static int missingnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swape(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for a missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swape(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
