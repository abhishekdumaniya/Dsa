package com.abhishek;

public class Count {
    public static void main(String[] args) {
        int n = 53898781;
        // in above integer 8 is a howmany time
        int count = 0;
        while (n > 0)
        {
            int remender = n%10;
            if (remender == 8) {
                count++;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}
