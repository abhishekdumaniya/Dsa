package com.abhishek.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimantion_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The 2-D array is 3X3---->");
        System.out.println("Enter a nine element--->");
        int[][] arr = new int[3][3];

        // Using for loop input taken by a user
        // Row
        for (int row=0; row < arr.length; row++){
            // for each colum in every row
            for (int col=0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        // Output
//        for (int row=0; row < arr.length; row++){
//            // for each colum in every row
//            for (int col=0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int row=0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
//        System.out.println();
//        for (int[] ints : arr) {
//            System.out.println(Arrays.toString(ints));
     }
}

