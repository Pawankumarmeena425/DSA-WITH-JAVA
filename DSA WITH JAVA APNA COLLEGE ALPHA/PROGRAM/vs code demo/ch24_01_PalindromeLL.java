package com.company;

public class ch24_01_PalindromeLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data){
//       Create a new node
        Node newnode = new Node(data);
        size++;
//        If ll is empty
        if(head==null){
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void reversell(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next  = prev;
            prev= curr;
            curr = next;
        }
        head = prev;

    }
    public void printll(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->>");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public  Node zigZag(Node head){
//        Find mid of Linkedlist
        Node mid = Node(head);
//        Reverse 2nd half
        Node rhead =  reversell(mid.next);
        Node lhead = head;
//       Alternative Merging
        Node nextL,nextR;
        while(rhead!=null&&lhead!=null){
//            Zig zag order
            nextL = lhead.next;
            lhead.next = rhead;
            nextR = rhead.next;
            rhead.next  =  nextL;

//            Update both head
            lhead =  nextL;    //left head
            rhead = nextR;
        }
        return head;
    }
   public  boolean palindromell(){

//        if ll is empty of 1 node
       if(head==null||head.next==null){
           return true;
       }

//        Findout mid of LL
        Node midNode = midOfll();
//        Reverse 2nd Half
       Node pre=null;
       Node curr = midNode;
       Node next;
       while(curr!=null){
           next  = curr.next;
           curr.next = pre;
           pre = curr;
           curr = next;
       }
//       Now pre is at the end of the LinkedList

       Node right = pre;
//       Right half head
       Node left =head;
//       left half head
       while(right!=null){
           if(right.data!=left.data){
               return false;
           }
           right = right.next;
           left = left.next;
       }

        return true;
   }
   public Node midOfll(){
        Node slow  = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
//            +1 Steps go slow
            slow = slow.next;
//            +2 Steps go fast
            fast = fast.next.next;
        }
        return slow;
   }
    public static void main(String[] args) {
        ch24_01_PalindromeLL ll = new ch24_01_PalindromeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);;
        ll.printll();
        ll.reversell();
        ll.printll();
        System.out.println(ll.palindromell());
    }
}
