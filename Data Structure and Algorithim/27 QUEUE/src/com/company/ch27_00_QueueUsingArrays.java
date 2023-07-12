package com.company;

public class ch27_00_QueueUsingArrays {
static class Queue{
    public static int arr[];
    public static int size;
    public static int rear;

    Queue(int n){
        arr=new int[n];
        this.size=n;
        rear=-1;
    }
//    public static int front = arr[0];   ---->> If we do like this then it will give error , because static variable
//    resolve first (first allocate memory to the static variable and method)
//    Is Empty
    public static boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }

//    Add operation
    public static void add(int data){
        if(rear==size-1){
            System.out.println("Quues is full!!");
            return;
        }
        rear = rear+1;
        arr[rear]=data;
    }

//    Remove operation
    public static int remove(){
        if(rear==-1){
            System.out.println("Queue is Empty!!");
            return -1 ;
        }
        int front = arr[0];
//        shift array elemnt to the reight
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear = rear-1;
        return front;  // front always point to the zeroth index
    }



//    Peek Operation  --->> Jankna
    public static int peek(){
        if(rear==-1){
            System.out.println("Queue is empty!!!");
            return -1;
        }

        return arr[0];
    }
}
    public static void main(String[] args) {
Queue q = new Queue(5);
q.add(1);
q.add(2);
q.add(3);
q.add(4);

while(!q.isEmpty()){
    System.out.println(q.peek());;
    q.remove();
}

    }
}
