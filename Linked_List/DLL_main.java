package com.abhishek.Linked_List;
public class DLL_main {
    public static void main(String[] args) {
        DLL dl = new DLL();

        dl.insertfirst(4);
        dl.insertfirst(3);
        dl.insertfirst(2);
        dl.insertfirst(1);
        dl.display();
        System.out.println();
        System.out.println("Insert the Last Position");
        dl.insertlast(45);
        dl.display();
        System.out.println();
        System.out.println("Insert the middle");
        dl.insertmiddle(3,69);
        dl.display();
        System.out.println();
    }

}
