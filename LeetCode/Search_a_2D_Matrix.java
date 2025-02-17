package com.abhishek.LeetCode;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1}
        };
        System.out.println(searchinmatrix(arr,0));
    }
    static boolean searchinmatrix(int[][] matrix, int target){
        int r = 0;  // r means row
        int c = matrix.length-1;  // c means colum
        while (r < matrix.length && c>=0){
            if (matrix[r][c] == target){
                return true;
            }
            if (matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return false;
    }
}
