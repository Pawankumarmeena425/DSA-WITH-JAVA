package com.company;

public class ch17_00_PracticeQuestion {
    public static int countPrimes(int n) {
        int arr[] = new int[n];
        // Set all element of array to 1
        for (int i = 2; i < arr.length; i++) {
            arr[i] = 1;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i] != 0) {
                int j = i + 1;
                while (j < n) {
                    if (j % i == 0) {
                        arr[j] = 0;
                    }
                    j++;
                }
                count++;
            }


        }
        return count;
    }
        public static void main (String[]args){

//            System.out.println(finalValueAfterOperations(arr));

            System.out.println(countPrimes(499979));

        }

}
