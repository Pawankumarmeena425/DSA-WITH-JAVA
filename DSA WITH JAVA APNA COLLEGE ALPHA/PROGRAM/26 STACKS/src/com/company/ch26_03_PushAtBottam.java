import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ch26_03_PushAtBottam {

public static class Stack{
ArrayList<Integer> list = new ArrayList<>();
public boolean isEmpty(){
    return list.size()==0;
}
public void pushAtBottom(ArrayList<Integer> list, int data){
    if(list.size()==0){
        list.add(data);
        return ;
    }
    int val =  list.get(list.size()-1);
    list.remove(list.size()-1);
    pushAtBottom(list, data);
    list.add(val);
}
    // push
    public void push(int data){
        pushAtBottom(list, data);
    }

    // Pop operation
    public int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    // Peek Operation
    public int peek(){
        return list.get(list.size()-1);
    }

}

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
s.push(2);
s.push(3);
s.push(4);

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
}
    }
    
}
