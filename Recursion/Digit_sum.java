package com.abhishek.Recursion;

import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(digit(n));
    }
    static int digit(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + digit(n/10);
    }
}
