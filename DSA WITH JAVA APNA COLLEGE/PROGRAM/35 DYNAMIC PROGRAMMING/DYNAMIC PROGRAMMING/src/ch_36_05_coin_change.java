public class ch_36_05_coin_change {
    public static int coinChanges(int coin[] , int sum){
        int n = coin.length;
        int dp[][] = new int[n+1][sum+1];

//        initlize 0th column with 1
        for(int i=0;i<coin.length;i++){
            dp[i][0]  =1;
        }
//        initlize 0th row with 0
        for(int j=0;j<=sum;j++){
            dp[0][j] = 0;
        }

//        i -->> number of coins
//        j-->> sum / changes
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1]<=j){ // valid case
                    dp[i][j] = dp[i][j-coin[i-1]]+dp[i-1][j];
                }
                else{ // exclude
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];

    }
    public static void main(String[] args) {
        int coin[] = {2,5,3,6};
        int sum=10;
        System.out.println(coinChanges(coin,sum));
    }
}
