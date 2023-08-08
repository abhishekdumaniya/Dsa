package com.abhishek.Function;

import java.util.Scanner;

public class Number_is_greaterthan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n) {
      if (n >= 1){
          return true;
      }else {
          return false;
      }
    }
}



