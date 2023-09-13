package com.abhishek.LeetCode;

public class Contain_Most_water {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostwater(nums));
    }
    static int mostwater(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int max =0;
        while (start < end){
            int width = end - start;
            int hight = Math.min(arr[start], arr[end]);
            int area = width * hight;
            max = Math.max(max,area);
            if(arr[start] < arr[end]) start++;
//            else if(arr[start] > arr[end]) end--;
            else {
                end--;
            }
//            else {
//                start++;
//                end--;
//            }

        }
        return max;
//        int maxright = 0;
//        int maxleft = arr.length;
//        int mid = start + (end - start) / 2;
//        for (int i = start; i <= mid; i++) {
//            if (arr[start] < arr[i]){
//                start = i;
//            }
//        }
//        for (int i = end; i > mid ; i--) {
//            if (arr[end] < arr[i]){
//                end = i;
//            }
//            if ()
//        }
//
//        System.out.println(end);
//        return start;
    }
}
