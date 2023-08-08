package com.abhishek.Function;

public class Scope {
    public static void main(String[] args) {
        int a = 10;                // a is 25 but change the a
        String s = "Abhishek";     // s is abhishek but change the s
        //in this code an int variable (a) is different value
        {
            a = 25;
            System.out.println(a);
            s = "Jack";
            System.out.println(s);
        }
        // Scoping in a for loops
        for (int i=0; i<4; i++){
            System.out.println(i);
        }
        // System.out.println(i); show error
    }


}
