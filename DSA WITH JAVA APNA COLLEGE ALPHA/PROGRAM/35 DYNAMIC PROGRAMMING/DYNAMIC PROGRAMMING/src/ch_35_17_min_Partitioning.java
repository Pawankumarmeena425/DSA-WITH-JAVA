public class ch_35_17_min_Partitioning {
    public static int minPartitioning(int nums[]){
        int n = nums.length;
//        Calculate sum of all elements
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= nums[i];
        }
        int cap = sum/2; // it is maximum capacity that can allowed inside the set1
        int dp[][] = new int[n+1][cap+1];
//        0th row and 0th column already fill with 0
        for(int i=1;i<n+1;i++){
            for(int j=1;j<cap+1;j++){
                int val = nums[i-1];
                if(val<=j){ // valid case
                    dp[i][j] = Math.max(dp[i-1][j-val]+val , dp[i-1][j]);
                }
                else{
                    dp[i][j]  =  dp[i-1][j];
                }
            }
        }


        int sum1 = dp[n][cap];
        int sum2 = sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        int nums[] = {1,6,11,5};
        System.out.println(minPartitioning(nums));
    }
}
