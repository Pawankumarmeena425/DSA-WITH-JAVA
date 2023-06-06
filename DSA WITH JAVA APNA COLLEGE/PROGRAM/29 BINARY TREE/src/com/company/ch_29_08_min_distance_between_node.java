package com.company;

public class ch_29_08_min_distance_between_node {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right  = null;
        }
    }
    public static Node lca(Node root,int n1,int n2){
        if(root ==null || root.data  == n1||root.data ==n2){
            return root;
        }
        Node left = lca(root.left,n1,n2);
        Node right = lca(root.right,n1,n2);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }
    public static int dis(Node lca,int n){
        if(lca==null){
            return -1;
        }
        if(lca.data==n){
            return 0;
        }
        int left = dis(lca.left,n);
        int right=  dis(lca.right,n);
        if(left!=-1){
            return left+1;
        }
        else if(right!=-1){
            return right+1;
        }
     else {
            return -1;
        }
    }
    public static int minDis(Node root, int n1,int n2){
        Node lc = lca(root,n1,n2);
        int dis1 = dis(lc,n1);
        int dis2 = dis(lc,n2);
        return dis1+dis2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right  =  new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minDis(root,4,6));

    }
}
