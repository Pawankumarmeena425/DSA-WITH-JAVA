package com.company;

public class ch20_02_QuickSort {
    public static int partesion( int arr[],int si,int ei){
        int pelement  = arr[si];
        int count  =0;
//        For finding right position of pivot element
        for (int i = si+1;i<arr.length;i++){
            if (arr[i]<pelement){
                count ++;
            }
        }

        int pindex = si+count;
//Set pivot elements at the right position

        arr[si]=arr[pindex];
        arr[pindex]=pelement;
        int i = si;
        int j= ei;

//        Partesion in the array
        while (i<=pindex&&j>=pindex){
            while (arr[i]<=arr[pindex]){
                i++;
            }
            while(arr[j]>=arr[pindex]){
                j--;
            }
            if (i<=pindex&&j>=pindex){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return pindex;
    }
    public static void quickSort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
//       For Partesion elements and find right position of pivot index
        int pind = partesion(arr,si,ei);
//        Left part sorting
        quickSort(arr,si,pind-1);
//        Right part sorting
        quickSort(arr,pind+1,ei);

    }
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,8,1,4,6,9};
        quickSort(arr,0,arr.length-1);
        printarray(arr);
    }

}
