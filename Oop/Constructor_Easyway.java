package com.abhishek.Oop;

class Mymainemployee{
    private int id;
    private String name;

    // Constructor
    public Mymainemployee(){
        id = 45;
        name = "John Wick";
    }
    public Mymainemployee(String mynames){
        id = 45;
        name = mynames;
    }

    // Getter or setter for a private
    public String getName() {return name; }
    public int getId() {return id;}
    public void setName(String n){name = n;}
    public void setid(int i){id = i;}
}

public class Constructor_Easyway {
    public static void main(String[] args) {
       Mymainemployee jack = new Mymainemployee("Jaky");
        System.out.println(jack.getId());
        System.out.println(jack.getName());
    }
}
