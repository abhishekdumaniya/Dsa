package com.abhishek.LeetCode;

import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
    static int reverse(int x) {
            long finalNum = 0;
            while(x!=0){
                int lastDig = x%10;
                finalNum += lastDig;
                finalNum = finalNum*10;
                x= x/10;
            }
            finalNum = finalNum/10;
            if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
                return 0;
            }
            if(x<0){
                return (int)(-1*finalNum);
            }
            return (int)finalNum;
    }
}

