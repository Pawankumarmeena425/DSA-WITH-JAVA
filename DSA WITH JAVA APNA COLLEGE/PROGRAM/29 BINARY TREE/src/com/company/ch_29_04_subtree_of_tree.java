package com.company;

public class ch_29_04_subtree_of_tree {
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


        public static boolean isIdentical(Node node,Node subroot)
        {
            if(node==null&&subroot==null){
                return true;
            }
//            conditions for non -identical
            else if(node==null||subroot==null||node.data!=subroot.data){
                return false;
            }
            if(!isIdentical(node.left,subroot.left)){
                return false;
            }
            if(!isIdentical(node.right,subroot.right)){
                return false;
            }

            return true;
        }
        public static boolean isSubtree(Node root, Node subroot){

            if(root.data == subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
//           dono parts me se kisi ak parts me bhi exist karta  hai to  true return kar denge
            return isSubtree(root.left,subroot)||isSubtree(root.right,subroot);
        }
    }
    public static void main(String[] args) {
//        create a tree
        Node root = new Node(1);
        root.left=  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        create a subtree
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.isSubtree(root,subroot));

    }
}
