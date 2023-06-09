import java.util.Arrays;

public class ch_35_02_knapsack {

    public static int knapsack(int val[] , int wt[] , int w , int n){ // O(2^n)
        if(w==0||n==0){
            return 0;
        }



        if(wt[n-1]<=w){ //valid condition
//            case 1 : include
            int ans1 =val[n-1]+ knapsack(val , wt , w-wt[n-1] , n-1);

//            case 2 : exclude
            int ans2 = knapsack(val , wt , w, n-1);

            return Math.max(ans1,ans2);
        }

//        invalid condition : exclude
        else{
            return knapsack(val ,wt , w ,n-1);
        }
    }
    public static int knapsackMemo(int val[] , int wt[] , int w , int n,int dp[][]){ //O(n)
        if(w==0||n==0){
            return 0;
        }


        if(dp[n][w]!=-1){
            return dp[n][w];
        }

        if(wt[n-1]<=w){ //valid condition
//            case 1 : include
            int ans1 =val[n-1]+ knapsackMemo(val , wt , w-wt[n-1] , n-1,dp);

//            case 2 : exclude
            int ans2 = knapsackMemo(val , wt , w, n-1,dp);

            return dp[n][w] = Math.max(ans1,ans2);
        }

//        invalid condition : exclude
        else{
            return dp[n][w] = knapsackMemo(val ,wt , w ,n-1,dp);
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        int dp[][] = new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("Max. Profit using recursion  : "+knapsack(val  , wt ,w ,val.length ));

        System.out.println("Max. Profit using recursion  and Memorization : "+knapsackMemo(val  , wt ,w ,val.length ,dp));
    }
}
