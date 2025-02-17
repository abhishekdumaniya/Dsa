package com.abhishek.Oop;

class Student1{
    String name;


    void Gretting(){
        System.out.println("Hello! My name is a: "+name);
    }
    void changeName(String Newname){
        name = Newname;
    }
    Student1(){
        this.name="abhishek Dumaniya";
    }

}
public class
Change_name {
    public static void main(String[] args) {
        Student1 abhishek = new Student1();
        abhishek.changeName("Jack L");
        abhishek.Gretting();

    }
}
