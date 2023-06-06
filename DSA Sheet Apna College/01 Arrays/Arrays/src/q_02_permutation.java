import java.util.ArrayList;

public class q_02_permutation {
    public static void permutation(int ind , int arr[] , ArrayList<ArrayList<Integer>> ans){
        if(ind == arr.length){
//            copy the current array permutation into a list
            ArrayList<Integer>list = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                list.add(arr[i]);
            }
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i = ind; i<arr.length ; i++){
            swap(i,ind,arr); // swap with self
            permutation(ind+1,arr,ans);
            swap(i,ind,arr);// now swap current i with i+1

        }
    }
    public static void swap(int i , int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        permutation(0 , arr,ans);
        System.out.println(ans);
    }
}
