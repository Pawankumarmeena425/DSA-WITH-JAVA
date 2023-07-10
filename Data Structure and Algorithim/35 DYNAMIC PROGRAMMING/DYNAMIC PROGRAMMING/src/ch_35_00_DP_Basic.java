public class ch_35_00_DP_Basic {

    public static int fib(int n){  // Time complexity - O(2^n)
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

//    Memorization Problem
    public static int fibDP(int n , int f[]){ // O(n)
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }

        f[n] = fibDP(n-1,f)+fibDP(n-2,f);
        return f[n];
    }

//    Tabulation
    public static int fibTB(int n){
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1] = 1;
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
        int f[] = new int[n+1] ; // all values initlize with zeros
        System.out.println(fibDP(n,f));

        System.out.println(fibTB(n));
    }
}
