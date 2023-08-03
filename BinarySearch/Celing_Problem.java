package com.abhishek.BinarySearch;
// Only for ascending order
public class Celing_Problem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 15, 24, 55, 77, 88, 99};
        int target = 14;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The target is 14");
        System.out.println("The target is not found return the target after number");
        int ans = celing(arr,target);
        System.out.println(ans);
    }
    static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // Find a middle element
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        // target is a not find in an array return next element
        return  start;
    }
}