package com.company;

public class LinkedListBasic {
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
    public void addFirst(int data){
//        Step 1 - Create a node
        Node newNode = new Node(data);
        size++;
//        if Linkedlist is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
//        Step 2 - Point new node's next = head
        newNode.next = head;
//        Step 3 ---- head = newNode
        head = newNode;
    }
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

public void printLinked(){
        if(head==null){
            System.out.println("LinkedList is empty!!!");
            return ;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->>");
          temp = temp.next;
        }
    System.out.println("null");
}
public void add(int index,int data){
        Node newnode  = new Node(data);
    if(index==0){
        addFirst(data);
        return ;
    }
    int i=0;
    Node temp = head;
    while(i<index-1){
        temp = temp.next;
        i++;
    }
    newnode.next = temp.next;
    temp.next = newnode;
    size++;
}
public int removeFirst(){
        int val = head.data;
        if(size==0){
            System.out.println("Linked list is already empty!! Be carefull bhiya ");
return Integer.MAX_VALUE;
        }
//        head and tail point to the same node
        else if(size==1){
            head=tail=null;
            size = 0;
            return val;
        }
        head = head.next;
        size--;
        return val;
}
public int removeLast(){
        int val  = tail.data;
        if(size==0){
            System.out.println("Linked list is empty!!");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            head = tail=null;
            size=0;
            return val;
        }
        int i =0;
        Node temp = head;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        tail  = temp;
        tail.next = null;
        size--;
        return val;
}
public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return  -1;
}
public int recSearch(int key,Node temp){
        if(temp==null){
            return -1;
        }
        else if(temp.data==key){
            return i;
        }
        i++;
        return recSearch(key,temp.next);
}

public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        head =prev;
}
static int i=0;
    public void removeNthNodeEnd(int n){
//        Calculate size
        int sz=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
//        if Delete first node (delete head)
        if(n==sz){
            head = head.next;
            return;
        }
//        Delete sz-n+1 Node form start
        int i=1;
        Node pre =head;
        while(i<sz-n){
            pre = pre.next;
            i++;
        }
        pre.next = pre.next.next;
        return;

    }
    public static void main(String[] args) {
LinkedListBasic ll = new LinkedListBasic();
ll.printLinked();
ll.addFirst(1);
ll.printLinked();
ll.addFirst(2);
ll.printLinked();
ll.addLast(3);
ll.printLinked();
ll.addLast(4);
ll.printLinked();
ll.add(2,23);
ll.printLinked();
//System.out.println("Size of linkedlist is = "+ll.size);
//        System.out.println(ll.removeFirst()+" has been deleted!!");
//        ll.printLinked();
//        System.out.println(ll.removeLast()+" has been deleted!!");
//    ll.printLinked();
//        System.out.println(ll.removeLast()+" has been deleted!!");
//        ll.printLinked();
//        System.out.println(ll.itrSearch(1));
//        System.out.println("Search useing recursion!!");
//        System.out.println(ll.recSearch(23,head));
       ll.reverse();
       ll.printLinked();

//       Remove linked list from last
       ll.removeNthNodeEnd(3);
       ll.printLinked();

    }
}
