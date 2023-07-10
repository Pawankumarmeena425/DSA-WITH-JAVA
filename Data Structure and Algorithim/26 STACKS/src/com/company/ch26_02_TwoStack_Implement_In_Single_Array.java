package com.company;

public class ch26_02_TwoStack_Implement_In_Single_Array {
    public static class TwoStack {

        // Initialize TwoStack.
        int arr[];
        int top1 =-1;
        int top2 = Integer.MAX_VALUE;
        int size = Integer.MAX_VALUE;
        public TwoStack(int s) {
            arr =  new int[s];
            top2 = s;
            size=s;

        }

        // Push in stack 1.
        public void push1(int num) {
            if(top2-top1>1){ // atleast one space must be present for push
                top1++; //left to right
                arr[top1] = num;
            }
            else{
                System.out.println("Stack OverFlow");
            }
        }

        // Push in stack 2.
        public void push2(int num) {
                if(top2-top1>1){
                    top2--;
                    arr[top2] = num;
                }
                else{
                    System.out.println("Stack Overflow");
                }
        }

        public int pop1() {
            if(top1>=0){
                int ans = arr[top1];
                top1--;
                return ans;
            }
           else{
               return -1;
            }

        }

        public int pop2() {
            if(top2<size){
                int ans = arr[top2];
                top2++;
                return ans;
            }
            else{
                return -1;
            }
        }


    }
    public static void main(String[] args) {
            TwoStack obj = new TwoStack(6);
            obj.push1(3);
            obj.push2(7);
            obj.push2(349);
        System.out.println(obj.pop1());


    }
}
