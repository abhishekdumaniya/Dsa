package com.abhishek.Function;

import java.util.Arrays;

public class Var_Arg {
    public static void main(String[] args) {
//        fun(5,46,56,5,6,46,59,8,46,6);
//        multi(20,56, "Abhi", "Jack");
        fun(25);
    }
    static void fun(int ...v){ // variable number of argument
        System.out.println(Arrays.toString(v));
      }
    static void multi(int a, int b, String ...v){

    }
}
