package com.company;

public class Ch_14_06_Question_SearchingInRoatedSortedArrya {
    public static int Searching(int arr[],int k){
        {
            // Write your code here.
            int s=0;
            int e= arr.length-1,mid=0;
            while(s<e){
                mid = s+(e-s)/2;
                if(arr[mid]>=arr[0]){
                    s = mid+1;
                }
                else{
                    e = mid;
                }
            }
            int pivot = mid+1;
//            System.out.println(pivot);
            e = arr.length-1;
            s=0;
            if (k==arr[0]){
                return 0;
            }
           else if(k<arr[0]){
                s = pivot;
            }
            else{
                e = pivot-1;
            }

            while(s<=e){
                mid = s+(e-s)/2;
                if(k==arr[mid]){
                    return mid;
                }
                else if(k>arr[mid]){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2 ,4, 5, 6, 8, 9, 1};
        int k=1;
        int val = Searching(arr,k);
        if (val==-1){
            System.out.println(k+" is not available in the array!!");
        }
        else{
            System.out.println( k+" is available at the index "+val);
        }
    }
}
