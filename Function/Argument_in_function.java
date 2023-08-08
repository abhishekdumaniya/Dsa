package com.abhishek.Function;

public class Argument_in_function {
    public static void main(String[] args) {
        // parameter
        int op = sum(30,20);
        System.out.println(op);

    }
    static int sum(int a, int b){
        int ans = a + b;
        return ans;
    }

}
