package com.abhishek.Oop;

class Myemployee{
    private int id;
    private String name;

    public void setname(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }
    public String getname(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        Myemployee jack = new Myemployee();
//        jack.id=5;
//        jack.name="My name is a abhishek";        through error because use a private acess modifier
        jack.setname("My name is abhishek");
        System.out.println(jack.getname());
        jack.setid(15);
        System.out.println(jack.getId());

    }
}
