package com.abhishek.LeetCode;

public class Set_Mismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swape(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for a missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swape(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
