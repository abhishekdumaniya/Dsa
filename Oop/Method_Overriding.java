package com.abhishek.Oop;
class A{
    public int a;
    public int jack(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am a method 2 class os B");
    }
    public void meth3(){
        System.out.println("I am a method 3 class os B");
    }

}

public class Method_Overriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();
    B b = new B();
    b.meth2();
    }
}
