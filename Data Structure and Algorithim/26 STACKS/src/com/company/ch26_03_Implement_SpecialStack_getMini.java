package com.company;
import java.util.*;
public class ch26_03_Implement_SpecialStack_getMini {
    public class SpecialStack {
        // Define the data members.


        /*----------------- Public Functions of SpecialStack Implement the getMIni element in the O(1) time complexity -----------------*/
        Stack<Integer>s = new Stack<>();
        int mini = Integer.MAX_VALUE;

        void push(int data) {
            // Implement the push() function.
            if(s.isEmpty()){ //1st element push inside the stack
                s.push(data);
                mini = data;
            }
            else{
                if(data<mini){
                    s.push(2*data-mini);
                    mini = data;
                }
                else{
                    s.push(data);
                }
            }
        }

        int pop() {
            // Implement the pop() function.

            if(s.isEmpty()){
                return -1;
            }
            int curr = s.peek();
            s.pop();
            if(curr>mini){
                return curr;
            }
            else{
                int preMini = mini;
                int val = 2*mini-curr;
                mini  =  val;
                return preMini;
            }
        }

        int top() {
            // Implement the top() function.

            if(s.isEmpty()){
                return -1;
            }
            int curr = s.peek();
            if(curr<mini){
                return mini;
            }
            else{
                return curr;
            }
        }

        boolean isEmpty() {
            // Implement the isEmpty() function.
            return s.isEmpty();
        }

        int getMin() {
            // Implement the getMin() function.
            if(s.isEmpty()){

                return -1;
            }
            return mini;
        }
    }
    public static void main(String[] args) {

    }
}
