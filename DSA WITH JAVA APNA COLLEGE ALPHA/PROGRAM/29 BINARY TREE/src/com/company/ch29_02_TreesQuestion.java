package com.company;

public class ch29_02_TreesQuestion {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right = null;
        }
    }
    static class BinaryTrees{
        public static int ind=-1;
        public static Node buildBinaryTree(int nodes[]){
           ind++;
            if(nodes[ind]==-1){
                return null;
            }
            //Create a new node
            Node newnode= new Node(nodes[ind]);
            newnode.left = buildBinaryTree(nodes);
            newnode.right = buildBinaryTree(nodes);
            return newnode;
        }
    }

    public static class Info {
        int ht;
        int diam;
     public  Info(int diam,int ht){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);;
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int height = Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,height);


    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildBinaryTree(node);
        System.out.println("Diameter of the tree:"+diameter(root).diam);
    }
}
