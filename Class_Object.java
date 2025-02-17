package com.abhishek;

import java.util.Scanner;

class Student{
    String name;
    int id;
    int age;
    public void data(){
        System.out.println("Name is " + name);
        System.out.println("age is " + age);
        System.out.println("id is " + id);
    }
    Student(int age, int name){
        System.out.println(age);
        System.out.println("Popat");
    }

}
public class Class_Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(20,5);
        s1.name = "Abhishek";
        s1.id = 005;
        s1.age = 20;
//        System.out.println("Student name is " + s1.name);
//        System.out.println("Student id is " + s1.id);
//        System.out.println("Student age is " + s1.age);
//        System.out.println();
        s1.data();
    }
}
