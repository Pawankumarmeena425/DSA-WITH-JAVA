package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ch29_01_PreOrderTree
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        public static int ind =  -1;
        public  Node buildTree(int node[]){
            ind++;
            if(node[ind]==-1){
                return null;
            }
            Node newNode = new Node(node[ind]);
            newNode.left = buildTree(node);
            newNode.right  =  buildTree(node);
            return newNode;
        }
    }
    public static void preorder(Node root){

        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
      inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){

        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){
                System.out.println();//print next line
                if(q.isEmpty()){//last next line nikli hai
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }


        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;

    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int ln = countNode(root.left);
        int rn = countNode(root.right);
        return ln+rn+1;


    }
    public static int sumNode(Node root){
        if(root==null){
            return 0 ;
        }
        int ls = sumNode(root.left);
        int rs = sumNode(root.right);
        return ls+rs+root.data;

    }
    public static int diameter(Node root){
        if(root==null){
            return 0 ;
        }
        int leftdi = diameter(root.left);
        int righdi = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdi = lh+rh+1;//include root node
        return Math.max(selfdi,Math.max(leftdi,righdi));
    }
    public static void main(String[] args) {
int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
BinaryTree tree = new BinaryTree();
Node root = tree.buildTree(node);
        System.out.println("Root value "+root.data);
        System.out.println("Preorder Tree");
        preorder(root);
        System.out.println("\nInorder Tree");
        inorder(root);
        System.out.println("\n Post Order traversal::");
        postorder(root);
        System.out.println("\n Level Order Traversal");
        levelOrder(root);
        System.out.println("Maximum height of the tree  Nodes is:: "+height(root));
        System.out.println("Maximum height of the tree edges is :: "+ (height(root)-1));
        System.out.println("Number of nodes in the tree is:: "+countNode(root));
        System.out.println("Sum of nodes in the tree is ::"+sumNode(root));
        System.out.println("Diameter of the tree is:: "+diameter(root));
    }
}
