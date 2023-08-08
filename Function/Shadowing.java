package com.abhishek.Function;

public class Shadowing {
    // Upper level
    static int x = 69; // This will be shadowed at line 7
    public static void main(String[] args) {
        int x = 5; // Lower level
        System.out.println(x); // 5
        fun();

    }
    static void fun(){
        System.out.println(x); // 9
    }
}
