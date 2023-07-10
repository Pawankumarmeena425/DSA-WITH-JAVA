import java.util.ArrayList;
import java.util.Arrays;

public class ch_35_01_Climbing_Stairs {
    public static int countWays(int n){  // O(2^n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        return countWays(n-1)+countWays(n-2);
    }
    public static int countWaysMemo(int n , int way[]){ // O(n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(way[n]!=-1){
            return way[n];
        }

        return way[n] = countWaysMemo(n-1 , way)+countWaysMemo(n-2 , way);

    }
    public static int countWaysTB(int n){
        int dp[]=  new int [n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1]+0;
            }
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Total way to reach the nth stair using Recursion is : " + countWays(n));
        int ways[] = new int[n+1];
        Arrays.fill(ways , -1); // -1,-1,-1,-1,-1,-1
        System.out.println("Total way to reach the nth stair using Recursion and Memorization  is : " + countWaysMemo(n , ways));
        System.out.println("Total way to reach the nth stair using Tabulation   is : " + countWaysTB(n));

    }
}

