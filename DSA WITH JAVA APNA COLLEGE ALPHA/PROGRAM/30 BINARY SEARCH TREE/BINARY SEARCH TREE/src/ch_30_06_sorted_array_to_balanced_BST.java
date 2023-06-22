public class ch_30_06_sorted_array_to_balanced_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node createBalancedBST(int arr[],int si,int ei){
        if(si>ei)
        {
        return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);
        root.left = createBalancedBST(arr,si,mid-1);//create left subtree
        root.right = createBalancedBST(arr,mid+1,ei);
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
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBalancedBST(arr,0,arr.length-1);
        preorder(root);

    }
}
