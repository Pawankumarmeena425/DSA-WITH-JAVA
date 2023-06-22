import java.util.Arrays;

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
    public static int mcmMemo(int arr[],int dp[][] , int i,int j){
        if(i==j){
            return 0;  // single matrix case
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1 = mcmMemo(arr,dp,i,k);    //Ai.....Ak  => arr[i-1]*arr[k]   = 1st metrix row * last metrix col
            int cost2 = mcmMemo(arr,dp,k+1,j);  // Ak+1 ..... Aj  => arr[k] * arr[j]
            int cost3 = arr[i-1]*arr[k]*arr[j];  // result : arr[i-1]*arr[j]    , cost  = a*b*d = arr[i-1]*arr[k]*arr[j]
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans,finalCost);
        }
        return dp[i][j] = ans;
    }
    public static int mcmTB(int arr[] ){
        int n = arr.length;
        int dp[][] = new int[n][n];

//        Initlization
        for(int i=0;i<n;i++){
            dp[i][i] = 0;
        }


//        Filling : bottom up manner
        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j] , cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void print(int dp[][]){
        for (int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;
        int dp[][] = new int[n][n];
//        fill with -1
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println("Minimum cost of metrix multiplation using recursion :: "+mcm(arr,1,arr.length-1));
        System.out.println("Minimum cost of metrix multiplation using Memorization :: "+mcmMemo(arr,dp,1,arr.length-1));
        System.out.println("Minimum cost of metrix multiplation using Tabulation :: "+mcmTB(arr));

    }
}
