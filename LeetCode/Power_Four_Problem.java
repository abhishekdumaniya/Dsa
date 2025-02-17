package com.abhishek.LeetCode;

import java.util.Scanner;

public class Power_Four_Problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(power(m));
    }
    static boolean power(int n){
        for (int i = 0; i < 31; i++) {
            if (Math.pow(4,i) == n){
                return true;
            }
        }
        return false;
    }
}
