package com.abhishek.Oop;

class Student2{
   int rno;
   String name;
   float marks;

   Student2 (){
       this.rno = 14;
       this.name = "Rahul";        // In a psvm function in a call Student2() execution by a this
       this.marks = 59.69f;
   }

   Student2 (int rollno, String names, float mark){
       this.rno = rollno;
       this.name = names;         // In a psvm function in a call Student2(15, "jack",56.7f) execution by a this
       this.marks = mark;
   }
}
public class Constructor {
    public static void main(String[] args) {
        // Create a object
        Student2 rahul = new Student2(15,"JAck",96.65f);         //Student2()  It is called a constructor
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);


    }
}
