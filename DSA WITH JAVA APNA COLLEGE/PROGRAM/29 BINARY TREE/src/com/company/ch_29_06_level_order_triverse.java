package com.company;

public class ch_29_06_level_order_triverse {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelOrder(Node root , int level,int k){
        if(root==null){
            return ;
        }
        if(level == k){
            System.out.print(root.data+ " ");
            return; // no required to go further deep , because we only requried kth level
        }
        levelOrder(root.left,level+1,k);
        levelOrder(root.right,level+1,k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right  =  new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);
        levelOrder(root,1,3);
    }
}
