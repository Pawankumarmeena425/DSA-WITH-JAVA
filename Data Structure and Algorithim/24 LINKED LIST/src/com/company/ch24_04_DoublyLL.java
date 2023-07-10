package com.company;

import java.util.LinkedList;

public class ch24_04_DoublyLL {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        return;
    }

    public void remvoelast() {
        if (head == null) {
            System.out.println("Linked list is empty!!");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;

    }

    public void printll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
public Node reverseLL(Node curr){
    Node next;
    Node prev=null;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head = prev;
    return head;
}
public static void delete(Node head,int m,int n){
Node temp = head;
while(temp!=null){
    int i=1;
    while(i<m&&temp!=null){
        temp = temp.next;
        i++;
    }
    i=1;
    Node temp1 = temp.next;
    while(i<n&&temp1.next!=null){
temp1 = temp1.next;
i++;
    }
    temp.next  = temp1.next;
    temp = temp.next;
}


}
    public static void main(String[] args) {
        ch24_04_DoublyLL ll = new ch24_04_DoublyLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(3);
        ll.printll(head);
        ll.remvoelast();
        ll.printll(head);
        ll.addLast(6);
        ll.addLast(9);
        ll.printll(head);
        ll.addLast(7);
        ll.printll(head);
ll.reverseLL(head);
ll.printll(head);
ll.delete(head, 2, 1);
ll.printll(head);
    }
}