import java.lang.reflect.Array;
import java.util.ArrayList;

public class ch_30_07_BST_to_balanced_BST {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void inorder(Node root , ArrayList<Integer>list){
        if(root == null){
            return ;
        }
        inorder(root.left,list);
        System.out.print(root.data+" ");
        list.add(root.data);
        inorder(root.right,list);
    }
    public static void inorderprint(Node root ){
        if(root == null){
            return ;
        }
        inorderprint(root.left);
        System.out.print(root.data+" ");

        inorderprint(root.right);
    }
    public static Node balancedBST(ArrayList<Integer>list,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left  = balancedBST(list,si,mid-1);
        root.right = balancedBST(list,mid+1,ei);

        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        ArrayList<Integer>list = new ArrayList<>();
//        inorder sequence to array
        inorder(root,list);

////        convet list into array
//        Integer arr[] = new Integer[list.size()];
//        arr = list.toArray(arr);

        root = balancedBST(list,0,list.size()-1);
        System.out.println();
        inorderprint(root);


    }
}
