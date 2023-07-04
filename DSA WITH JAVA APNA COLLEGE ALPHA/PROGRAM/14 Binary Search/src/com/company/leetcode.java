package com.company;
import java.util.*;
public class leetcode {

    public static boolean isPossible(int pratas, int cooks, int[] ranks, int time) {
        int pratasDone = 0;

        for (int i = 0; i < cooks; i++) {
            int rank = ranks[i];
            int currTime = rank;
            int pratasCooked = 0;

            while (currTime <= time) {
                pratasCooked++;
                currTime += rank * (pratasCooked + 1);
            }

            pratasDone += pratasCooked;

            if (pratasDone >= pratas) {
                return true;
            }
        }

        return false;
    }
    public static int getPratas(int pratas, int cooks, int[] ranks) {
        int low = 0;
//        calculate maximum time
        int cooked = 0 ;
        int time = 0;
        int rank = ranks[cooks-1];
        while(cooked<pratas){
            cooked++;
            time +=rank*cooked;
        }
        int high = time;
        System.out.println(high);
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isPossible(pratas, cooks, ranks, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pratas = 10;
        int cooks = 4;
        int ranks[] = {1,2,3,4};
//        System.out.println("Enter the number of test cases : ");
//        int test = scanner.nextInt();
//        int j=0;
//        while(j<test){
//             System.out.print("Enter the number of pratas: ");
//            int pratas = scanner.nextInt();
//             System.out.print("Enter the number of cooks: ");
//            int cooks = scanner.nextInt();
//            int[] ranks = new int[cooks];
//
//             System.out.println("Enter the ranks of each cook  ");
//            for (int i = 0; i < cooks; i++) {
//                ranks[i] = scanner.nextInt();
//            }

            int minTime = getPratas(pratas, cooks, ranks);
             System.out.println("Minimum time required: " + minTime);

//            j++;
//        }
    }
}
