package com.abhishek.LeetCode;

import java.util.Scanner;

public class Power_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
    }
    static boolean power(int n){
        for (int i = 0; i < 31; i++) {
         if (Math.pow(2,i) == n){
             return  true;
         }
        }
        return false;
    }
}
