public class ch_35_16_MCM {
    public static int mcm(int arr[] , int i,int j){
        if(i==j){
            return 0;  // single matrix case
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k);    //Ai.....Ak  => arr[i-1]*arr[k]   = 1st metrix row * last metrix col
            int cost2 = mcm(arr,k+1,j);  // Ak+1 ..... Aj  => arr[k] * arr[j]
            int cost3 = arr[i-1]*arr[k]*arr[j];  // result : arr[i-1]*arr[j]    , cost  = a*b*d = arr[i-1]*arr[k]*arr[j]
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println("Minimum cost of metrix multiplation using recursion :: "+mcm(arr,1,arr.length-1));
    }
}
