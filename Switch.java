package com.abhishek;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        // Inhald switch statement
        switch (fruit) {
            case "Mango" -> System.out.println("The king of fruit");
            case "Apple" -> System.out.println("The sweet red fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("please enter a valid fruit");
        }
    }

}
