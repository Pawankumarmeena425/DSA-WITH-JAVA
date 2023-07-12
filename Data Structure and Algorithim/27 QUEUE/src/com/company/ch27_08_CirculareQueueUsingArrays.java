package com.company;

public class ch27_08_CirculareQueueUsingArrays {
    static class CircularQueue{
        public static int arr[];
        public static int front;
        public static int rear;
        public static int size;
        CircularQueue(int n){
            arr = new int[n];
            this.size = n;
            this.front = -1;
            this.rear = -1;
        }

        public static boolean isEmpty(){
            return front==-1&&rear==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full!!");
                return;
            }
//            when add first element
            if(rear==-1){
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");;
                return -1;
            }
            int val = arr[front];

//            when only one element left in the array and we want to delete that
            if(front ==rear){
                front=rear=-1;
            }
            else{
                front = (front+1)%size;
            }
            return val;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);
        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
