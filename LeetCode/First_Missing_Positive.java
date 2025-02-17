package com.abhishek.LeetCode;

public class First_Missing_Positive {
    static int missingnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swape(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for a missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swape(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
