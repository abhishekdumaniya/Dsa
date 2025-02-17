package com.abhishek.LeetCode;
// https://leetcode.com/problems/find-the-duplicate-number/
public class Find_Duplicate_Number {
    public int findDuplicate(int[] arr) {
            int i = 0;
            while (i < arr.length) {

                if (arr[i] != i + 1) {
                    int correct = arr[i] - 1;
                    if (arr[i] != arr[correct]) {
                        swape(arr, i, correct);
                    } else {
                        return arr[i];
                    }
                }else {
                        i++;
                    }
                }
            return -1;
        }
        static void swape(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}

