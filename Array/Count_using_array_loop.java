package com.abhishek.Array;

// User enter a number and find how many enter element in this array

import java.util.Scanner;
public class Count_using_array_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 3, 8, 9, 8, 7, 8, 1};
        int count = 0;
        for (int i = 0; i <= 7; i++) {
           System.out.print(arr[i] + " ");
           if (arr[i] == 8){
                count ++;
            }
            arr[i] = arr[i]/10;
        }
        System.out.println("Answer--->>");
        System.out.println(count + " ");
    }
}


