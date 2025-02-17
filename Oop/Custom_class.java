package com.abhishek.Oop;

class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is: "+ id);
        System.out.println("My name is: "+ name);
    }
    public int getSalary(){
        return salary;
    }

}

public class Custom_class {
    public static void main(String[] args) {
        Employee jack = new Employee();  // New Object
        Employee john = new Employee();  // New Object
        // Setting attributes
        jack.id=15;
        jack.name="abhishek";
        jack.salary=12000;
        john.id=5;
        john.name="John Wick";
        john.salary=15000;
        // printing a attributes
//        System.out.println(jack.id);
//        System.out.println(jack.name);
        jack.printdetails();
        john.printdetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
