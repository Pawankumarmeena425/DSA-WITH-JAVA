public class ch_30_02_delete_Node_In_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
//            insert into left subtree;
            root.left = insert(root.left,val);
        }
        else{
//            right subtree
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right = delete(root.right,val);
        }
        else if(root.data>val){
            root.left = delete(root.left,val);
        }
        else{
//            Case 1 : leaf Node
            if(root.left == null && root.right==null){
                return null;
            }
//            Case 2 : Single Child
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
//            Case 3 - Both Children
            Node IS = findInorderSuccessor(root.right);
//            IS available in the right subtree left most node
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
//        not require to handle root == null case , because  it is already handle in the case -2
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>= k1 && root.data <=k2){
//            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
//            printInRange(root.right,k1,k2);
        }
        if(root.data>k1){
            printInRange(root.left,k1,k2);
        }
        if(root.data<k2) {
            printInRange(root.right,k1,k2);
        }
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }
        root = delete(root,10);
        inorder(root);
        System.out.println();
printInRange(root,5,11);

    }
}
