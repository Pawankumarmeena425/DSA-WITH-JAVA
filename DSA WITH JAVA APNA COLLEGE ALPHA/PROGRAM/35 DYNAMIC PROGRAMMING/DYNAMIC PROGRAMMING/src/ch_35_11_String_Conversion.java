public class ch_35_11_String_Conversion {


    public static int lcs(String str1  , String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
//        0th row and 0th column already fill with zeros
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
    public static void stringConversion(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int lcsLength = lcs(str1,str2);

        int delete = n-lcsLength;
        int insert = m-lcsLength;

        System.out.println("Total Delete Operations : "+delete);
        System.out.println("Total Insert Operations : "+insert);

    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "aceg";
            stringConversion(str1,str2);
    }
}
