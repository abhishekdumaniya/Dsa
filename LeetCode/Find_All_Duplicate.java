package com.abhishek.LeetCode;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;
public class Find_All_Duplicate {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swape(arr, i, correct);
            } else {
                i++;
            }
        }
        // Find a missing element
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swape(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

