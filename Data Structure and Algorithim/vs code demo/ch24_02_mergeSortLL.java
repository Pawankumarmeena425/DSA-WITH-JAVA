package com.company;
import java.util.LinkedList;

public class ch24_02_mergeSortLL {
public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static Node tail;
public static int size;;
    public void addLast(int data){
//        Step 1 - Create a new node
        Node newNode =  new Node(data);
        size++;
//    Base Case -->>> if Linked List is empty
        if(head==null){
            head = tail=newNode;
        }
//    Step 2  ---->>> point tailnext's to the newNode
        tail.next = newNode;
//    Step 3 --->>> tail point to newNode
        tail = newNode;
    }
public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}
    public Node mergeSort(Node head){
//       Base case
        if(head==null||head.next==null){
            return head;
        }
//        Find mid of ll
        Node mid = findMid(head);
//Set mid node next to right head
        Node rHead =  mid.next;
        mid.next = null;
        Node lefthead = mergeSort(head);;
       Node righthead  = mergeSort(rHead);
return merge(lefthead,righthead);

    }
    public Node merge(Node headleft, Node headright){
        Node mergeLL  =new Node(-1);
        Node temp  = mergeLL;
        while(headleft!=null&&headright!=null){
            if(headleft.data<headright.data){
                temp.next = headleft;
                temp =  temp.next;
                headleft  =headleft.next;
            }
            else{
                temp.next = headright;
                temp = temp.next;
                headright = headright.next;
            }
        }
//        Add remening ll
        while(headleft!=null){
            temp.next = headleft;
            temp = temp.next;
            headleft  =headleft.next;
        }
while(headright!=null){
    temp.next = headright;
    temp = temp.next;
    headright = headright.next;
}
return mergeLL.next;
    }
  public void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->>");
            temp = temp.next;
        }
      System.out.println("null");
  }
    public static void main(String[] args) {
ch24_02_mergeSortLL ll = new ch24_02_mergeSortLL();
ll.addLast(3);;
ll.addLast(2);
ll.addLast(1);
ll.addLast(5);
ll.addLast(4);
ll.printLL(head);
 Node mergehead =   ll.mergeSort(head);
    ll.printLL(mergehead);
    }

}
