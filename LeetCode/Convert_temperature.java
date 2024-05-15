package com.abhishek.LeetCode;

import java.util.Arrays;

public class Convert_temperature {
    public static void main(String[] args) {
        System.out.println(converttemep(36.50));
    }
    static double[] converttemep(double calsius){
        double kelvin = calsius + 273.15;
        double fahrenheit = calsius * 1.80 + 32.00;
        double[] temp = {kelvin,fahrenheit};
        return temp;
    }
}
