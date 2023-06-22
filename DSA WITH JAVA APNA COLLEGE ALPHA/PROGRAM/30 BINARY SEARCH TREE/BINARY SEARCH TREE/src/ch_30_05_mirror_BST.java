public class ch_30_05_mirror_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        else if(root.data>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static Node mirror(Node root){
        if(root ==null){
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node righMirror = mirror(root.right);
        root.left = righMirror;
        root.right = leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        root = mirror(root);
        preorder(root);

    }
}
