package com.abhishek.LeetCode;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Find_Smallest_Letter {
    public static void main(String[] args) {
    char[] arr = {'c','f','j','k','m','p','q','r','s','z'};
    char target = 'p';
        System.out.println(smallestnumber(arr,target));
    }
    static int smallestnumber(char[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //Find middle element
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else if (start == arr.length-1) {
                return 0;
            }
            else {
                return mid + 1;
            }
        }
        return start;
    }
}
