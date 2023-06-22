package com.company;


import java.util.LinkedList;
public class ch24_03_zigzig_ll {
//    Node class definition
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
//    public static Node head;
//    public static Node tail;
    public static Node midNode(Node head){
        Node slow=head;
        Node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow  =slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }
    public static Node reverseSecondHalf(Node curr){
        Node pre = null;
        Node next;
        while(curr!=null&&curr.next!=null){
            next =  curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
//    public static Node zigZag(LinkedList ll){
////        Find mid of Linkedlist
//        Node mid = midNode(head);
////        Reverse 2nd half
//       Node rhead =  reverseSecondHalf(mid.next);
//       Node lhead = head;
////       Alternative Merging
//        Node nextL,nextR;
//        while(rhead!=null&&rhead.next!=null){
////            Zig zag order
//            nextL = lhead.next;
//            lhead.next = rhead;
//            nextR = rhead.next;
//            rhead.next  =  nextL;
//
////            Update both head
//          lhead =  nextL;    //left head
//           rhead = nextR;
//        }
//        return head;
//    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);

    }
}
