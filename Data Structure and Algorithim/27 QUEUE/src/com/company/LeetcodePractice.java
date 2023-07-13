package com.company;
import java.util.*;
public class LeetcodePractice {
    static class MyCircularDeque {
        int arr[];
        int size;
        int front;
        int rear;

        public MyCircularDeque(int k) {
            arr = new int[k];
            size = k;
            front = rear = -1;
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }
            if (front == -1) {
                front = rear = 0;
            }
            if (front == 0 && rear != size - 1) {
                front = size - 1;
            } else { // normal flow
                front--;
            }
            arr[front] = value;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            if (front == -1) {
                front = rear = 0;
            }
            if (rear == size - 1 && front != 0) {
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = value;
            return true;
        }

        public boolean deleteFront() {
            if(isEmpty()){
                return false;
            }
            int ans = arr[front];
            if(front==rear){ // single element
                front = rear =-1;
            }
            else if(front==size-1&& rear!=0){
                front = 0;
            }
            else{
                front++;
            }
            return true;
        }

        public boolean deleteLast() {
            if(isEmpty()){
                return false;
            }
            int ans = arr[front];
            if(front==rear){
                front = rear =-1;
            }
            else if(rear==0 && front != size-1){
                rear = size-1;
            }
            else{
                rear--;
            }
            return true;
        }

        public int getFront() {
            if(isEmpty()){
                return -1;
            }
            else{
                return arr[front];
            }
        }

        public int getRear() {
            if(isEmpty()){
                return -1;
            }
            else{
                return arr[rear];
            }
        }

        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }
    }
    public static void main(String[] args){
       MyCircularDeque obj = new MyCircularDeque(3);
        System.out.println(obj.insertLast(1));
        System.out.println(obj.insertLast(2));
        System.out.println(obj.insertFront(3));
    }
}
