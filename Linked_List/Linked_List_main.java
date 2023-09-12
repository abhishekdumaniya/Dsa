package com.abhishek.Linked_List;

public class Linked_List_main {
    public static void main(String[] args) {
       Linked_List list = new Linked_List();
       list.insertionfirst(3);
       list.insertionfirst(8);
       list.insertionfirst(33);
       list.insertionfirst(9);
       list.insertionfirst(5);

       list.insertionmiddle(56,3);

       list.insertionlast(99);
       list.display();

       System.out.println(list.deletefirst());
       list.display();
       System.out.println(list.deletelast());
       list.display();

       System.out.println(list.deletemiddle(2));
       list.display();
    }
}
