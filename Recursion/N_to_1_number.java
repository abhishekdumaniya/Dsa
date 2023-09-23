package com.abhishek.Recursion;

public class N_to_1_number {
    public static void main(String[] args) {
        fun(5);
        System.out.println();
        fun1(5);
    }
    // First Function call n to 1 number
    static void fun(int n){
        // Base condition
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    // Second Function call 1 to n number
    static void fun1(int n){
        // Base Condition
        if (n == 0){
            return;
        }
        fun1(n-1);
        System.out.println(n);
    }
}
