import java .util.Stack;
public class ch26_05_ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
int top = s.pop();
pushAtBottom(s, data);
s.push(top);

    }
    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack <Integer> s   = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
       reverseStack(s);
       System.out.println("Reverse stack");
       while(!s.isEmpty())
       {
        System.out.println(s.pop());
       }
    }
    
}
