public class ch_35_01_Climbing_Stairs {
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Total way to reach the nth stair using Recursion is : " + countWays(n));
    }
}

