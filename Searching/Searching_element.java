package com.abhishek.Searching;

public class Searching_element {
    public static void main(String[] args) {
        int[] nums = {12,4,5,7,-6,45,89,-23,12,-4};
        int target = 4;
       int ans = linersearching(nums , target);
        System.out.println(ans);

    }
  // Create a function
  static int linersearching(int[] arr, int target){
        if(target == 0){
            return -1;
        }
        // For loop for a every element
      for (int i = 0; i < arr.length; i++) {
          int element = arr[i];
          if (target == element){
              return element;
          }
      }
      // No found a target
      return -1;
  }

}
