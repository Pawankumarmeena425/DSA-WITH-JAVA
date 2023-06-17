public class ch_35_12_wildcard_Matching {
    public static boolean isMatch(String s, String p){
        int n=s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] = true;
//        other already false
//        Now handel case -->> empty text , and with some length of pattern
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-1];

            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){ // is situation me current character to handle ho jayega , dpende karta hai pervious character matched hai ya nahi
                    dp[i][j] = dp[i-1][j-1];

                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j] =  dp[i][j-1]||dp[i-1][j]; //(ignore || match)
                }
                else {
                dp[i][j] = false; // already false , not required this statement
                }

            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";
        System.out.println(isMatch(text , pattern));
    }
}
