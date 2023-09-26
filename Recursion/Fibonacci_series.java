package com.abhishek.Recursion;

public class Fibonacci_series {
    public static void main(String[] args) {
        System.out.println(fibbo(7));
    }
    static int fibbo(int n){
        //Base condition
        if (n < 2){
            return n;
        }
       return fibbo(n-1) + fibbo(n-2);
    }
}
