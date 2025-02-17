// Find a target of an array for a Searching

package com.abhishek.Searching;

public class Searching_target{
    public static void main(String[] args) {
        int[] nums = {12,15,48,-25,65,98,-12,45,-56};
        int target = 15;
        int ans = linersearch(nums,target);
        System.out.println(ans);
    }

    // Search in the array: return the index if item found
    // Otherwise if item is not found return -1
    static int linersearch(int[] arr, int target) {
        if (target == 0) {
            return -1;
        }
        // for loop every element of a index find a target
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // This line will execute if number of a return
        // element is not found

        return -1;
    }
}

