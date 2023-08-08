package com.abhishek.Function;

public class Swap {
    public static void main(String[] args) {
        int a = 10; // first object
        int b = 20;
        // Swap number
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b){
        int temp = a; // create a new second object
        a = b;
        b = temp;
    }
}
