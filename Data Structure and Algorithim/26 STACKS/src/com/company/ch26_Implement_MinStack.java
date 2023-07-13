package com.company;
import java.util.*;

public class ch26_Implement_MinStack {

     static class MinStack {
        // Apporch using two stack
        Stack<Integer> stack;
        Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            // push  the minimum value in the minStack
            if (minStack.isEmpty()) {
                minStack.push(val);
            } else {
                int mini = Math.min(val, minStack.peek());
                minStack.push(mini);
            }
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
    public static void main(String[] args) {
        MinStack obj  =  new MinStack();
        obj.push(-2);;
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        obj.pop();
        System.out.println(obj.getMin());

    }
}
