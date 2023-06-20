public class ch_36_01_construct_ST {
    public static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static int buildST(int arr[] , int ind , int start , int end)
    {
        if(start==end){
            tree[ind] = arr[start];
            return tree[ind];
        }
        int mid = (start+end)/2;
        buildST(arr,ind*2+1 , start,mid); // left subtree - i*2+1
        buildST(arr,ind*2+2 , mid+1,end); // right subtree - i*2+2

        tree[ind]=  tree[ind*2+1]+tree[ind*2+2];
        return tree[ind];
    }
    public static int getSumUtil(int i , int si , int sj, int qi, int qj){
        if(qj<=si || qi>=sj){ // non overlapping case
            return 0;
        }
        else if(si>=qi && sj<=qj){ // complete overlapping
            return tree[i];
        }
        else{ // partial overlapping
            int mid = (si+sj)/2;
            int left = getSumUtil(i*2+1 , si,mid,qi,qj);
            int right = getSumUtil(i*2+2,  mid+1,sj,qi,qj);
            return left+right;
        }
    }
    public static int getSum(int arr[] , int qi,int qj){
        int n = arr.length;
        return getSumUtil(0,0,n-1,qi,qj);
    }

    public static void updateUtil(int i, int si,int sj, int ind,int diff){
        if(ind>sj || ind<si){ // not in the range case
            return ;
        }
        else{
            tree[i] += diff;
            if(si!=sj){  // non-leaf case
                int mid = (si+sj)/2;
                updateUtil(i*2+1 , si,mid,ind,diff);
                updateUtil(i*2+2,mid+1,sj,ind,diff);
            }
        }
    }
    public static void update(int arr[] , int ind , int newVal){
        int n = arr.length;
        int diff = newVal-arr[ind];
        arr[ind] =newVal; // update value in the array
//        now update value in the Segment Tree
        updateUtil(0,0,n-1,ind,diff);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr,0,0,n-1);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println(getSum(arr,2,5));
        update(arr,2,2);

        System.out.println("Segment tree after update:: ");
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
    }
}
