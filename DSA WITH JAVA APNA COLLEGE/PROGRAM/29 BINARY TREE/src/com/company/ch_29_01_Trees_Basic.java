package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ch_29_01_Trees_Basic {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int ind=-1;
        public static Node buildTree(int nodes[]){
            ind++;
            if(nodes[ind]==-1){
                return null;
            }
            Node newNode  = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
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
//                System.out.print(-1+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){

            if(root==null){
//                System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            Queue<Node>q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();


                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);//again add null for next line
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root node of the tree : " +root.data);
        System.out.println("Preorder Triverse : ");
        tree.preorder(root);
        System.out.println("\nInorder Triverse : ");
        tree.inorder(root);
        System.out.println("\nPost Order Triverse:");
        tree.postorder(root);
        System.out.println("\nLevel Order Triverse :");
        tree.levelOrder(root);
    }
}
