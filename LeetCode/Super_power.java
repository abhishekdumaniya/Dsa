package com.abhishek.LeetCode;

public class Super_power {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int a = 2;
        System.out.print(pow(a,arr));
//        System.out.println(pow(a,arr));
    }
    static int pow(int a,int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num*10+arr[i];
        }
        System.out.print(Math.pow(a,num));
        return 0;
    }

}
