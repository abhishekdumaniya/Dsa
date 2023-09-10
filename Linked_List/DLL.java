package com.abhishek.Linked_List;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    private class Node{
        int val;
        Node next;
        Node previous;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null){
            head.previous = node;
        }
        head = node;
    }

    public void insertlast(int val){
        Node node = new Node(val);
        Node tail = head;

        node.next = null;

        if (head == null){
            node.previous = null;
            head = node;
            return;
        }

        while (tail.next != null){
            tail = tail.next;
        }

        tail.next = node;
        node.previous = tail;

    }

    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertmiddle(int after, int val){
        Node p = find(after);
        if (p == null){
            System.out.println("does not exit");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.previous = p;
        if (node.next != null) {
            node.next.previous = node;
        }
    }


}
