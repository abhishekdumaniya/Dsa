package com.abhishek.Recursion;

public class Digit_Product {
    public static void main(String[] args) {
        System.out.println(product(155));
    }
    static int product(int n){
        //Base condition
        if (n%10 == n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}
