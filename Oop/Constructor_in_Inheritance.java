package com.abhishek.Oop;
class Base1{
    Base1(){
        System.out.println("I am Base Constructor");
    }

    Base1(int x){
        System.out.println("I am an overloading Constructor with the valuse of x: "+ x);
    }

}
class Derive1 extends Base1 {

    Derive1() {
        //super(5);    // super keyword is use to argument constructor run in a base class
        System.out.println("I am Derived Constructor");
    }
    Derive1(int x, int y){
        super(x);
        System.out.println("I am an overloading Constructor with the valuse of y: "+ y);

    }
}
class Childofderived extends Derive1{
    Childofderived(){
        System.out.println("I am Default constructor");
    }
    Childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloading Constructor with the valuse of z: "+ z);
    }

}

    public class Constructor_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derive1 d = new Derive1();
//        Derive1 d = new Derive1(40,50);
        Childofderived cd = new Childofderived(10,20,30);
    }

}
