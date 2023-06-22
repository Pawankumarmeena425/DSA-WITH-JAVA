public class ch_35_07_lcs {
    public static int lcs(String str1, String str2, int n ,int m){
//        Base Case
        if(n==0||m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){ // last character is same
            return lcs(str1,str2,n-1,m-1)+1;
        }
        else{ // last character is different
            int ans1 = lcs(str1, str2,n-1,m);
            int ans2 = lcs(str1,str2, n, m-1);
            return Math.max(ans1,ans2);
        }
    }

    public static int lcsMemo(String str1, String str2, int n ,int m,int dp[][]){
//        Base Case
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){ // last character is same
            return dp[n][m] = lcs(str1,str2,n-1,m-1)+1;
        }
        else{ // last character is different
            int ans1 = lcs(str1, str2,n-1,m);
            int ans2 = lcs(str1,str2, n, m-1);
            return dp[n][m] =  Math.max(ans1,ans2);
        }
    }

    public static int lcsTB(String str1, String  str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
//        0th row and 0th column already fill with 0

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{ // different
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println("Longest common subsequence using recursion : "+lcs( str1,str2,str1.length(),str2.length()));
        int n=str1.length() , m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("Longest common subsequence using recursion and memorization : "+lcsMemo(str1,str2,n,m,dp));
        System.out.println("Longest common subsequence using Tabulation : "+lcsTB(str1,str2));


    }
}
