package com.abhishek.Recursion;

public class Reverse_Number{

    public static void main(String[] args) {
//        rev(1234);
//        System.out.println(sum);
        System.out.println(rev1(123456));
    }
    static int sum = 0;
    static void rev(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n/10);
    }

    static int rev1(int n){
        //sum time you might need some additional variables in the argument
        //in that case make another function
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n,digit);
    }
    private static int helper(int n, int digit) {
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10,digit-1) + helper(n/10,digit-1);
    }
}
