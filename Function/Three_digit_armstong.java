package com.abhishek.Function;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Three_digit_armstong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(arm(n));

    }
    static boolean arm(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem + rem + rem;
        }
        if (sum == original);
        {
            return true;
        }


    }
}
