public class ch_35_15_mountain_ranges {
    public static int moutainRanges(int n){
        int dp[] = new int[n+1];
        dp[0] = dp[1] =1;

        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
//                dp[i] += dp[j]*dp[i-j-1];
                    int inside = dp[j];
                    int outside = dp[i-j-1];
                    dp[i] += inside*outside;
            }

        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(moutainRanges(n));
    }
}
