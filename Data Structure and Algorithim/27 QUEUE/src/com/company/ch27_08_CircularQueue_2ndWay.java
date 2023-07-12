package com.company;

public class ch27_08_CircularQueue_2ndWay {
    public static class CircularQueue {
        // Initialize your data structure.
        int arr[];
        int front;
        int rear;
        int size;
        public CircularQueue(int n) {
            arr  =new int[n];
            front=rear=-1;
            size = n;
        }

        /*
           Enqueues 'X' into the queue. Returns true if it gets pushed into the stack,
           and false otherwise.
        */
        public boolean add(int value) {
            if((rear+1)%size==front){ // when queue is full
                return false;
            }

            else if(front ==-1){
                front = rear = 0;
            }
            else if(rear==size-1 && front!=0){
                rear = 0;
            }
            else{ // normal flow
                rear++;
            }
            arr[rear] =  value;
            return true;
        }

        /*
          Dequeues top element from queue. Returns -1 if the stack is empty, otherwise
          returns the popped element.
        */
        public int remove() {
            // Write you code here.
            if(front==-1 && rear==-1){
                return -1;
            }
            int ans  =  arr[front];
            if(front==rear){
                front = rear =-1;
            }
            else if(front == size-1){
                front = 0;
            }
            else{ //normal flow
                front++;
            }
            return ans;
        }
        public boolean isEmpty(){
            return front==-1 && rear==-1;
        }
    }
    public static void main(String[] args) {
     CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);

    }
}
