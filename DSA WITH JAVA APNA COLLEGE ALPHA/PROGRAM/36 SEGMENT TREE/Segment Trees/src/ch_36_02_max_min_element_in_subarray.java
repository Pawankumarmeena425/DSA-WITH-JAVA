public class ch_36_02_max_min_element_in_subarray {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int i,int si,int sj,int arr[]){
        if(si==sj){
            tree[i] = arr[si];
        return;
        }
        int mid = (si+sj)/2;
        buildST(i*2+1,si,mid,arr); // left part
        buildST(i*2+2,mid+1,sj,arr); // right part
        tree[i] = Math.max(tree[i*2+1],tree[i*2+2] );
    }
    public static int getMaxUtil(int i , int si,int sj, int qi,int qj){
        if(qj<si || qi>sj){ // not overlapping case
            return Integer.MIN_VALUE;
        }
        else if(si>=qi && sj<=qj ){ // complete overlapping
            return tree[i];
        }
        else{ // partial overlapping
            int mid = (si+sj)/2;
            int left = getMaxUtil(i*2+1 , si,mid,qi,qj);
            int right = getMaxUtil(i*2+2 , mid+1,sj,qi,qj);
            return Math.max(left,right);
        }
    }
    public static int getMax(int arr[], int qi,int qj){
        int n = arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);
    }

    public static void updateUtil(int i , int si,int sj, int ind ,int newVal){
        if(ind<si||ind>sj){
            return;
        }
        else{
           if(si==sj){
               tree[i] = newVal;
           }
            if(si!=sj){
                tree[i] = Math.max(tree[i] , newVal);
                int mid = (si+sj)/2;
                updateUtil(i*2+1,si,mid,ind,newVal);
                updateUtil(i*2+2,  mid+1,sj,ind,newVal);
            }
        }
    }
    public static void update(int arr[] , int ind,int newVal){
        arr[ind] = newVal;
        updateUtil(0,0,arr.length-1,ind,newVal);
    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildST(0,0,n-1,arr);
        for (int i=0;i< tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println(getMax(arr,2,3));

        System.out.println();
        update(arr,2,20);
        System.out.println("Segment tree after updation : ");
        for (int i=0;i< tree.length;i++){
            System.out.print(tree[i]+" ");
        }
    }
}
