public class ch_35_03_target_sum_Subset {

    public static boolean targetSumSubsetTB(int arr[] , int sum){
        int n=  arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }
//        by default other values are fill with false
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                int val = arr[i-1]; // ith index value

                if(val<=j && dp[i-1][j-val]==true){ // include case
                    dp[i][j] = true;
                }
                else if(dp[i-1][j]==true){ // exclude case
                    dp[i][j] = true;
                }
            }
        }
    print(dp);
        return dp[n][sum];
    }
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] ={4,2,7,3,1};
        int target = 10;
        System.out.println(targetSumSubsetTB(num , target));
    }
}
