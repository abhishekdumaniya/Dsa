package com.abhishek.Searching;

import java.util.Arrays;

public class Search_in_2D_array {
    public static void main(String[] args) {
        int[][] num = {
                {23, 4, 1},
                {45, 56, 78, 15, 4},
                {45, 78, 25, 5}
        };
        int target = 25;
        int[] ans = search(num,target);   // Format of the return value {roe,colum}
        System.out.println(Arrays.toString(ans));
        }
        static int[] search(int arr[][], int target){
        // For loop for a row
            for (int row=0; row < arr.length; row++){
                for (int colum=0; colum < arr[row].length; colum++){
                    if (arr[row][colum] == target){
                        System.out.println("The number is find row index:" + row + "Index colum" +colum);
                        return new int[]{row,colum};
                    }
                }
            }
            // No number is find
            return new int[]{-1,-1};
        }
}


