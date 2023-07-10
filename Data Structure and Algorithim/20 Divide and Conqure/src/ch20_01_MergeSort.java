public class ch20_01_MergeSort {
   public static void merge(int arr[],int si,int ei,int mid){
int temp[]=new int[ei-si+1];
int i=si;
//Starting index for left part
int j = mid+1;
//Starting Index for Right Part
int k = 0;
//Starting Index for temp arr

       while(i<=mid&&j<=ei){
           if (arr[i]<arr[j]){
               temp[k]=arr[i];
               i++;       k++;
           }
           else{
               temp[k]=arr[j];
              j++;       k++;
           }

       }

//       Copy left part remaning elements
       while(i<=mid){
           temp[k]=arr[i];
           i++;
           k++;
       }
       //       Copy Right part remaning elements
       while(j<=ei){
           temp[k]=arr[j];
           j++;
           k++;
       }

//       copy temp array elements in the original array

       for ( k=0,i=si;k<temp.length;k++,i++){
           arr[i]=temp[k];

       }

   }

    public static void mergeSort(int arr[], int si, int ei){
        int mid = si+(ei-si)/2;
        if (si>=ei){
            return ;
        }
//        Left Part
        mergeSort(arr,si,mid);
//        Right part
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
