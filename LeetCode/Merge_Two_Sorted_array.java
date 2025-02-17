package com.abhishek.LeetCode;

public class Merge_Two_Sorted_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums,3,nums2,2);

    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m + n];
        int i = m;
        int j = n;
        int k = 0;

        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n){
            mix[k] = nums1[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            nums1[m + l] = mix[l];
        }
    }
}
