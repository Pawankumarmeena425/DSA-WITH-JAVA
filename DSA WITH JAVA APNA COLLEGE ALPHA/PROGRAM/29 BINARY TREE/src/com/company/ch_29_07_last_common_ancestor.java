package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ch_29_07_last_common_ancestor {
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
    public static boolean  getPath(Node root, int n,ArrayList<Node> list){
        if(root==null){
            return false;
        }
        list.add(root);

        if(root.data==n){
            return true;
        }
        boolean left = getPath(root.left,n,list);
       boolean right =  getPath(root.right,n,list);

       if(left || right){
           return true;
       }
       else{
           list.remove(list.size()-1);
           return false;
       }
    }
    public static Node lca(Node  root,int n1,int n2){
        ArrayList<Node>path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
         getPath(root,n1,path1);
         getPath(root,n2,path2);
//         Deep copy

//        Last common ancestor
        int i=0;
        while(i<path1.size()&&i<path2.size()){

            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }

//        last common equal  nodes
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1||root.data==n2){
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);

//        leftLca = null and rightlca = valid value
        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }
        return root;//when leftlca = valid and rightlca = valid
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right  =  new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca(root,4,5).data);
        System.out.println(lca2(root,4,5).data);
    }
}
