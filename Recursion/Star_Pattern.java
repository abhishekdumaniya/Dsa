package com.abhishek.Recursion;

public class Star_Pattern {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    //Normal pattern
    static void triangle2(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            triangle2(r,c+1);
            System.out.print("*");

        } else {
            triangle2(r-1,0);
            System.out.println();
        }
    }

    //Reverse star pattern
    static void tringle(int r, int c){
        //r - row
        //c - colum
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("*");
            tringle(r,c+1);
        } else {
            System.out.println();
            tringle(r-1,0);
        }
    }
}
