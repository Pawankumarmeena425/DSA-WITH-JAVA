package com.company;

public class ch20_03_SearchIn_RoatedandSortedArray {
    public static int pivot(int arr[]){
        int si =0;
        int ei = arr.length-1;
        while (si<ei){
            int mid = si+(ei-si)/2;
            if (mid!=0&&arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[0]){
                ei = mid;

            }
            else{
                si = mid+1;
            }

        }
        return 0;
    }
    public static int rotateSearch(int arr[],int pind,int key){

//        Search in the 0 to pind index
if (key>=arr[0]){
    int si = 0;
    int ei = pind;
    while (si<=ei){
        int mid = si+(ei-si)/2;
        if (key==arr[mid]){
            return mid;
        }
        else if(key>arr[mid]){
            si = mid+1;
        }
        else{
            ei = mid-1;
        }
    }

}
//Search in the pind+1 index to arr.length-1 index
else{
    int si = pind+1;
    int ei = arr.length-1;
    while (si<=ei){
        int mid = si+(ei-si)/2;
        if (key==arr[mid]){
            return mid;
        }
        else if(key>arr[mid]){
            si = mid+1;
        }
        else{
            ei = mid-1;
        }
    }
}
return -1;
    }

public static int searchRotate(int arr[],int si,int ei,int key){
     if (si>ei) {
     return -1;
     }
     int mid = si+(ei-si)/2;

     if (arr[mid]==key){
         return mid;
     }
//     Mid Lie on the line L1
    if (arr[mid]>=arr[si]){
//       Search : Line l1 left Part
        if (key>=arr[si]&&key<=arr[mid]){
         return  searchRotate(arr,si,mid,key);
        }
//        Search : Line L1 Right Part
        else{
            return searchRotate(arr, mid+1,ei,key);
        }
    }
//    Mid Lie on the line L2(arr[mid]<arr[si])
    else{
//        Search : Line L2 Right part
        if (key<=arr[si]&&key>=arr[mid]){
            return searchRotate(arr,mid+1,ei,key);
        }
//        Search : Line L2 Left Part
        else{
            return searchRotate(arr,si,mid,key);
        }
    }

}
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 9, 0, 1, 2, 3};
////        First Apporch Using Iteration
//
//
//        int pind = pivot(arr);
//        System.out.println(pind);
//        int index = rotateSearch(arr, pind, 92354);
//        if (index == -1) {
//            System.out.println("Key is not availabe in the array!!");
//        }
//        else {
//            System.out.println("Key is availabe at the index " + index);
//
//        }

//         Second Better way using Recursion

        int i = searchRotate(arr, 0, arr.length - 1, 6);

        System.out.println(i);
    }
        }


