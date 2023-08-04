package com.abhishek;

import java.util.Scanner;

public class CaLculator_Using_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter a operation add(+) ,subtract(-), multiply(*), divide(/): ");
            char ch = sc.next().trim().charAt(0);

            if (ch == '*' || ch == '/' || ch == '-' || ch == '+' || ch == '%'){
                System.out.print("Enter a two number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (ch == '+'){
                    ans = num1 + num2;
                }
                if (ch == '-'){
                    ans = num1 - num2;
                }if (ch == '*'){
                    ans = num1 * num2;
                }if (ch == '%'){
                    ans = num1 % num2;
                }if (ch == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if (ch == 'x' || ch == 'X'){
                    System.out.println("Invalid Operation");
                }
                System.out.println(ans);
            }
        }
    }
}
