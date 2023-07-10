import java.util.Stack;
public class ch26_03_2_PushAtBottam {

    public static void pushAtBottom(Stack <Integer> s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);
                }
    public static void main(String[] args) {
        // Using JCF
     Stack <Integer> s  =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(s,6);

while(!s.isEmpty()){
    System.out.println(s.pop());

}
    }
    
}
