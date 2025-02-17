package com.abhishek.Searching;

public class Max_Element_in_2D_array {
    public static void main(String[] args) {
        int[][] num = {
                {12,5,6,4},
                {2,4,89},
                {45,78,12,98}
        };
        System.out.println(max(num));
    }
    static int max(int arr[][]){
        int ans = arr[0][0];  // int ans = Integer.MIN_VALUE
        for (int r=1; r< arr.length;r++){
            for (int c = 0; c < arr[r].length; c++) {
                if (ans < arr[r][c]) {
                    ans = arr[r][c];
                    System.out.println("The maximum value is: " + arr[r][c]);
                    return 0;
                }
            }
        }
        return -1;
    }
}
