package com.abhishek.LeetCode;
//      https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Remove_Duplicated {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(dupicates(arr));
    }
    static int dupicates(int[] nums){
        int[] arr = new int[101];
        int[] arrMin = new int[101];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 0) {
                arrMin[nums[i]*(-1)]++;
            }else {
                arr[nums[i]]++;
            }
        }
        int k=0;
        for(int i=arrMin.length-1;i>0;i--) {
            if(arrMin[i] > 0) {
                nums[k++] = (-1) * i;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > 0) {
                nums[k++] = i;
            }
        }
        return k;
    }
}
