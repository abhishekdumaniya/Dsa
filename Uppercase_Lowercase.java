package com.abhishek;

import java.util.Scanner;

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch > 'a' && ch < 'z'){
            System.out.println("Lowercase");

        }
        else {
            System.out.println("Upercase");
        }
    }
}
