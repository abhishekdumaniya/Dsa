package com.abhishek.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimantion_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][] arr = new int[3][];   // Create a 2-D array
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //For a row
//        for (int row = 0; row < arr.length; row++) {
//            //For a colum
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}



