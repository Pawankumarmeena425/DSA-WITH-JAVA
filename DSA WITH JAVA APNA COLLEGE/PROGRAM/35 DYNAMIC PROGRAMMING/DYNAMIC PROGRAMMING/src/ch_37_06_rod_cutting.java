public class ch_37_06_rod_cutting {

//    weight = length , value = price , W = totRod
    public static int rodCutting(int length[] , int price[] , int totRod){
        int n = price.length;
        int dp[][]= new int[n+1][totRod+1];
//        all values are initlize with zero already


        for(int i=1;i<dp.length;i++){
            for(int j=1;j<totRod+1;j++){
                int len = length[i-1];
                int p = price[i-1];
                if(len<=j){// valid case
                    dp[i][j] = Math.max(p+dp[i][j-len] , dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][totRod];
    }
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price [] = {1,5,8,9,10,17,17,20};
        int totRod = 8;
        System.out.println(rodCutting(length,price,totRod));
    }
}
