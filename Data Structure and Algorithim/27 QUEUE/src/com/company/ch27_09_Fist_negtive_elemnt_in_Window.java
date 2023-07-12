package com.company;
import java.util.*;
public class ch27_09_Fist_negtive_elemnt_in_Window {
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {

        long ans[] = new long[N-K+1];
        Deque<Integer> dq = new LinkedList<>();
        int ind=0;
        // process first k element
        for(int i=0;i<K;i++){
            if(A[i]<0){ // push only negative index value
                dq.addLast(i);
            }
        }
        if(dq.size()>0){
            ans[ind] = A[dq.getFirst()];
            ind++;
        }
        else{
            ans[ind] = 0;
            ind++;
        }

        for(int i=K;i<N;i++){
            if(!dq.isEmpty() && i - dq.getFirst() >=K){ // out of window condition
                dq.removeFirst();
            }

            // Addition
            if(A[i]<0){
                dq.addLast(i);
            }

            if(dq.size()>0){
                ans[ind] = A[dq.getFirst()];
                ind++;
            }
            else{
                ans[ind] = 0;
                ind++;
            }
        }



        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        return ans;

    }
    public static void main(String[] args) {
        long arr[] = {-8, 2, 3, -6, 10};
        int n=5;
        int k =2;// window size
        printFirstNegativeInteger(arr,n,k);

    }
}
