package com.company;

public class ch_29_02_hight_of_tree {
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

    static class BinaryTree {
        static int ind = -1;

        public static Node buildTree(int nodes[]) {
            ind++;
            if (nodes[ind] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh= height(root.right);
            return Math.max(lh,rh)+1;
        }

        public static int noOfNodes(Node root){
            if (root==null){
                return 0;
            }
            int ln=  noOfNodes(root.left);
            int rn = noOfNodes(root.right);
            return ln+rn+1;
        }

        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int ls = sumOfNodes(root.left);
            int rs = sumOfNodes(root.right);
            return ls+rs+root.data;
        }
    }
        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println("height of the tree is " + tree.height(root));
            System.out.println("Number of nodes in the tree is :  "+tree.noOfNodes(root));
            System.out.println("sum of nodes in the tree is : "+tree.sumOfNodes(root));

    }
}
