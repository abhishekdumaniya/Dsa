package com.abhishek.Oop;

class Base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and Setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am Constructor");
    }
}
class Derived extends Base{
    public int y;


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // creating an object of a Base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        b.printme();

        // Creating an object of a derived class
        Derived d = new Derived();
        d.setY(55);
        System.out.println(d.getY());

    }
}
