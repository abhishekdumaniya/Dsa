package com.abhishek.Oop;

import java.util.Arrays;
// Create a class Syntax
//    class classname {
//          Something write here
//    }
// for evert single student
class Student {
    int rno;
    String name;
    float marks;

    // We need a way to add this values of the above
    // properties object by object
    // we need one word to access every object


    Student () {
        // this keyword replace a line no 37,38,39
        this.rno = 45;
        this.name = "Abhishek";
        this.marks = 87.99f;
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
public class Introduction {
    public static void main(String[] args) {
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
    Student[] students = new Student[5];
    // Just declare
//        Student abhishek;
//        abhishek = new Student();

        Student abhishek = new Student(15,"Abhishek",87.33f);
//            abhishek.rno = 05;
//            abhishek.name = "Abhishek";
//            abhishek.marks = 87.99f;



//        System.out.println(Arrays.toString(students));
        System.out.println(abhishek.rno);
        System.out.println(abhishek.name);
        System.out.println(abhishek.marks);
    }
}

