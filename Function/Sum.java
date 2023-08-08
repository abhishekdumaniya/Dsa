package com.abhishek.Function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    // return value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        return num1 + num2;
        // return means khatam tata by by
        // System.out.println("Over"); show error
    }


//    static void sum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a first number: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter a second number: ");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum is= " + sum);
//          }
}
