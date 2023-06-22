package com.company;

public class ch27_QueueUsingLL {
    static class Queuell{
static  class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;

public static boolean isEmpty(){
    return head==null;
}

//Add Node
       public static void add(int val){
//           Create a new node
           Node newnode = new Node(val);
           if(head==null){
               head =tail = newnode;
               return ;
           }

               tail.next = newnode;
               tail = newnode;

       }

       public static int remove(){
           if(isEmpty()){
               System.out.println("Queue is empty!!");
               return -1 ;
           }
           int val = head.data;
           head = head.next;
           return val;
       }
public static  int peek(){
    if (isEmpty()){
        System.out.println("Queue is empty!!");
        return -1 ;
    }
    return head.data;
}

    }

    public static void main(String[] args) {
        Queuell ql = new Queuell();
        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(7);
        ql.remove();
        ql.add(5);
        while(!ql.isEmpty()){
            System.out.println(ql.peek());
            ql.remove();
        }
    }
}
