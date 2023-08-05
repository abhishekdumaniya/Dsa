package com.abhishek;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        float salary = sc.nextInt();
        if(salary>10000){
            salary += 2000;
        }
        else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
