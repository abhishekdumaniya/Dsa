package com.abhishek.BinarySearch;

import java.util.Arrays;

public class Row_Colum_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {20,29,37,49},
                {33,34,39,50}
        };
        System.out.println(Arrays.toString(search(arr,44)));
    }
    static int[] search(int[][] matrix, int taget){
        int r = 0;  // r means row
        int c = matrix.length-1;  // c means colum
        while (r < matrix.length && c>=0){
            if (matrix[r][c] == taget){
                return new int[]{r,c};
            }
            if (matrix[r][c] < taget){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
