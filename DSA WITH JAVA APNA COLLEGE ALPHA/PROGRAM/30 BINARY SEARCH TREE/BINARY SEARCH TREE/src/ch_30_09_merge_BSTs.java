import java.util.ArrayList;
public class ch_30_09_merge_BSTs {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void inorder(Node root , ArrayList<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static void mergeList(  ArrayList<Integer>list1,  ArrayList<Integer>list2,  ArrayList<Integer>result){
        int i = 0 ,j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                result.add(list1.get(i));
                i++;
            }
            else{
                result.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            result.add(list2.get(j));
            j++;
        }
    }

    public static Node mergeBST(ArrayList<Integer>result,  int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(result.get(mid));
        root.left = mergeBST(result,si,mid-1);
        root.right = mergeBST(result,mid+1,ei);
        return root;
    }
    public static void printTree(Node root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>result = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2, list2);
       mergeList(list1,list2,result);
        Node root = mergeBST(result,0,result.size()-1);
        printTree(root);






    }
}
