package com.abhishek.LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_no_373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n");
        int n = sc.nextInt();
        System.out.print("Enter a m");
        int m = sc.nextInt();
        ArrayList<Integer> num1 = new ArrayList<>(n);
        ArrayList<Integer> num2 = new ArrayList<>(m);
        // Input num1
        for (int i=0; i<n; i++){
            num1.add(sc.nextInt());
        }
        // output num1
        for (int i=0; i<n; i++){
        }
        System.out.println(num1);
        // Input num2
        for (int j=0; j<m; j++){
            num2.add(sc.nextInt());
        }
        // output num2
        for (int j=0; j<m; j++){
        }
        System.out.println(num2);
    }
}
