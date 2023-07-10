package com.company;

public class ch_14_07_sqrt {
    public static double sqrt(int n){
        if(n==0||n==1){
            return 1;
        }
        double si=0;
        double ei = n;
        double ans = 0 ;
        while(si<=ei){
            double mid = (si+ei)/2;
            if(mid==n/mid){ // mid*mid = n -->> is costly as multiplation is too much time consuming
                return mid;
            }
            else if(mid<n/mid){//mid*mid<n
                ans = mid;
                si = mid+1;
            }
            else {
                ei = mid-1;
            }
        }
        System.out.println(ans);
//        For calucation of decamical values
        double inc = 0.1;
        for(int times = 1;times<=3;times++){ // calculate till 3 decimal points
            while(ans <= n/ans){ // ans*ans <=n
                ans = ans+inc;
            }
            // now at the end : case ans*ans>n occurs , means subratc 0.1 , so value will be less then number
//           overshot values
            ans = ans-inc;
            inc = inc/10;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }
}
