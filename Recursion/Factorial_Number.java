package com.abhishek.Recursion;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        //Base condition
        if (n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
