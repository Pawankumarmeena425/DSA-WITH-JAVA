import java.util.Stack;
public class ch26_07_nextGraterElement {
    public static void nextGrater(int arr[],int nextG[]){
        Stack <Integer>s = new Stack<>();


    for(int i=arr.length-1;i>=0;i--){
        int curr =  arr[i];
        while(!s.isEmpty()&&curr>=arr[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            nextG[i]=-1;
        }
        else{
             
            nextG[i]=arr[s.peek()];
        }
        // s.push(arr[i]);// in this case we push array element
        s.push(i); //IN this case we push array index
    }

    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextG[]=new int[arr.length];
        nextGrater(arr,nextG);
        for(int i=0;i<nextG.length;i++){
            System.out.println(nextG[i]);
        }
    }
    
}
