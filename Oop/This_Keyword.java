package com.abhishek.Oop;

class Ekclass{
    int a;
    public int getA(){
        return a;
    }

    Ekclass(int a){
        this.a =a;
    }
    public int return1(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("Mai ek Constructor hu");
    }
}


public class This_Keyword {
    public static void main(String[] args) {
        Doclass d = new Doclass(65);
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
    }
}
