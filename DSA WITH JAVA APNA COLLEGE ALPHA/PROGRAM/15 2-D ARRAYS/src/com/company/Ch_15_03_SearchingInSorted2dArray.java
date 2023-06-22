package com.company;

public class Ch_15_03_SearchingInSorted2dArray {
    public static int searching(int arr[][],int key){
//        Burte Force Apporch ----->>>T.C  = O(n2)
//        for (int i=0;i<arr.length;i++){
//            int s=0,e=arr[0].length-1;
//            while (s<=e){
//                int mid = s+(e-s)/2;
//                if (key==arr[i][mid]){
//                    System.out.println(key+ " find at the position ("+i+" , "+mid+") ");
//                    return mid;
//                }
//                else if (key>arr[i][mid]){
//                    s = mid+1;
//                }
//                else{
//                    e = mid-1;
//                }
//            }
//        }

//2nd Better Approach
        int s=0,e=arr.length-1;

//        while(s<=arr.length-1 && e>=0)
//        {
//            if (arr[s][e]==key){
//                System.out.println(key+ " find at the position ("+s+" , "+e+") ");
//                    return 0;
//            }
////            Move Left
//            else if(arr[s][e]>key){
//                e = e-1;
//            }
////            Move Bottom
//            else{
//                s=s+1;
//            }
//        }

//        3rd Alternative Approch
        int row=arr.length-1;
        int col = 0;
        while (row>=0&&col<arr.length){
            if (arr[row][col]==key){
                System.out.println(key+ " find at the position ("+row+" , "+col+") ");
                return 0;
            }
//           move top
            else if(key<arr[row][col]){
                row--;
            }
//            right move
            else{
             col++;
            }
        }
        System.out.println(key+" not available in the metrix!!");
        return -1;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int k=10;
       int val=searching(arr,k);
//       if (val==-1){
//           System.out.println(k+" not available in the metrix!!");
//       }
    }
}
