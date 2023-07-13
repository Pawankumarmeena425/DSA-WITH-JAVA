package com.company;
import java.util.*;
import java.util.LinkedList;

public class ch27_11_max_min_In_Subarray_or_Window_Size_K {
    public static int sumOfMaxAndMinInWindowSizeK(int arr[] , int k){
        Deque<Integer>maxi = new LinkedList<>(); // Insert element in the increasing order
        Deque<Integer>mini = new LinkedList<>(); // Insert element in the increasing order
        int ans = 0;
//        Process First Window
        for(int i=0;i<k;i++){

//            Addition Logic
            while(!maxi.isEmpty() && arr[maxi.getLast()]<=arr[i]){
                maxi.removeLast(); // remove all the smallest element to the current element
            }
            while(!mini.isEmpty() && arr[mini.getLast()]>=arr[i]){
                mini.removeLast(); // remove all the greater element to the current element
            }
            maxi.addLast(i);
            mini.addLast(i);
        }

        ans += arr[maxi.getFirst()]+arr[mini.getFirst()]; // inclue first window mini and maxi

//        Process remaining windows
        for(int i = k;i<arr.length;i++){

//            Removel element which are outside the window
            while(!maxi.isEmpty() && i-maxi.getFirst()>=k){
                maxi.removeFirst();
            }
            while(!mini.isEmpty() && i- mini.getFirst()>=k){
                mini.removeFirst();
            }
            // Addition Logic
            while(!maxi.isEmpty() && arr[maxi.getLast()]<=arr[i]){
                maxi.removeLast(); // remove all the smallest element to the current element
            }
            while(!mini.isEmpty() && arr[mini.getLast()]>=arr[i]){
                mini.removeLast(); // remove all the greater element to the current element
            }
            maxi.addLast(i);
            mini.addLast(i);

            // Include maximum and minimum of current window
            ans += arr[maxi.getFirst()]+arr[mini.getFirst()];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;
        System.out.println(sumOfMaxAndMinInWindowSizeK(arr,k));
    }
}
