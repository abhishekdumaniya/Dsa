package com.abhishek.Linked_List;


public class Linked_List {

    private Node head;
    private Node tail;
    private int size;


    public Linked_List(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertionlast(int value){
        if (tail == null){
            insertionfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;

    }

    public void insertionmiddle(int value, int index){
        if (index == 0){
            insertionfirst(value);
            return;
        }
        if (index == size){
            insertionlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size ++;
    }

    public void insertionfirst(int value){
        Node node = new Node(value);
        node.next=head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public int deletefirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deletelast(){
        if (size <= 1){
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int value = tail.value;
        tail = secondlast;
        tail.next = null;
        return value;
    }

    public int deletemiddle(int index){
        if (index == 0){
            return deletefirst();
        }
        if (index == size - 1){
            return deletelast();
        }
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        return value;
    }


}


