package com.company;
import java.util.*;
public class ch_26_02_N_Stack_Implements {
    public static class NStack {
        // Initialize your data structure.
        int arr[];
        int top[];
        int next[];
        int freespot;
        int n, s;

        public NStack(int N, int S) {

            arr = new int[S];
            top = new int[N];
            next = new int[S];
            freespot = 0;

            // Initlize top with -1
            Arrays.fill(top, -1);

            // Initlize next -->> with next free spce
            for (int i = 0; i < S; i++) {
                next[i] = i + 1;
            }
            // Update last index with -1
            next[S - 1] = -1;
        }

        // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
        public boolean push(int x, int m) {
            // check stack overflow condition
            if (freespot == -1) {
                return false;
            }

            // Find index
            int index = freespot;

            // Update freespot
            freespot = next[index];

            // Insert an array
            arr[index] = x;

            // Update next
            next[index] = top[m - 1];

            // Update top
            top[m - 1] = index;


            return true;
        }

        // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
        public int pop(int m) {
            //    Reverse all the steps include in the push operation.

            // check underflow condition
            if (top[m - 1] == -1) { // stack empty condition
                return -1;
            }
            int index = top[m - 1];

            top[m - 1] = next[index];

            int ans = arr[index];

            next[index] = freespot;

            freespot = index;

            return ans;
        }
    }
        public static void main(String[] args) {
            NStack obj = new NStack(3,6);
            obj.push(10,1);
            obj.push(20,1);
            obj.push(30,2);
            System.out.println(obj.pop(1));
            System.out.println(obj.pop(2));
            System.out.println(obj.pop(2));// stack 2 is empty now , return -1

    }
}
