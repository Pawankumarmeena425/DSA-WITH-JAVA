package com.company;

public class Ch_15_00_BinarySearch {
    public static int  binarySearch(int metrix[][],int key){
        int row = metrix.length,col = metrix[0].length;
        int start=0,end=row*col-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int i = mid/col;
//            ----->>>>> It will give row index
            int j = mid%col;
//             ------>>>>> It will give colmun index
            if (metrix[i][j]==key){
                System.out.println(key+" find at the position ("+i+" , "+j+")");
                return 0;
            }
            else if(metrix[i][j]>key){
                end =mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(key+" not find  in the metrix!!!");
        return -1;
    }

    public static void main(String[] args) {
        int metrix [][]= {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        binarySearch(metrix,60);
    }
}
