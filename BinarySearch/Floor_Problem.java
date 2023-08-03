package com.abhishek.BinarySearch;
// Only for an ascending order
public class Floor_Problem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 15, 24, 55, 77, 88, 99};
        int target = 22;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The target is 22");
        System.out.println("The target is not found return the target before number");
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        int start  = 0;
        int end = arr.length-1;
        while (start <= end){
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        // target is a not find in an array return previous element
        return end;
    }
}