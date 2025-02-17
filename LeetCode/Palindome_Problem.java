package com.abhishek.LeetCode;
// Only for integer
import java.util.Arrays;
import java.util.Scanner;

public class Palindome_Problem {
    public static void main(String[] args){
        System.out.println("Enter a only Integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindome(n));
   }
   static boolean palindome(int x){
       if(x<0 || x!=0 && x%10 ==0 ) {
           return false;
       }
       int check=0;
       while(x>check){
           check = check*10 + x%10;
           x/=10;
       }
       return (x==check || x==check/10);
   }
}