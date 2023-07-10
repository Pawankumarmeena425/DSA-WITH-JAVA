package com.company;

public class ch_29_03_diameter_of_tree {

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
            return Math.max(height(root.left),height(root.right))+1;
        }

//        Apporch 1 : O(n2)
        public static int diameter1(Node root){
            if(root==null){
                return 0;
            }
//            when diameter is not passes through the root node
            int ld = diameter1(root.left);
            int rd = diameter1(root.right);

//            when diameter is passes through the root node
            int lh = height(root.left);
            int rh = height(root.right);
            int selfd = lh+rh+1;

            return Math.max(Math.max(ld,rd),selfd);

        }

//        Apporch 2 : O(n)
        public static class Info{
            int diam;
            int ht;
            public Info(int diam,int ht){
                this.diam =diam;
                this.ht = ht;
            }
        }
        public static Info diameter2(Node root){
            if(root ==null){
                return new Info(0,0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int diam  = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
            return new Info(diam,ht);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.diameter1(root));
        System.out.println(tree.diameter2(root).diam);

    }
}
