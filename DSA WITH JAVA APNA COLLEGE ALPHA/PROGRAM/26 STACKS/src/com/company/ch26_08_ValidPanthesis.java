import java.security.cert.PKIXRevocationChecker;
import java.util.Stack;
public class ch26_08_ValidPanthesis {
    public static boolean validPranthesis(String str){
        Stack <Character> s  = new Stack<>();
for(int i=0;i<str.length();i++){
    // push opening brackets in the stack
    if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
s.push(str.charAt(i));
    }
// Pop opening brackets corresponding to the cosing brackets
else{
    if(s.isEmpty()){
        return false;
    }
   char ch = str.charAt(i);
   if(ch==')'&&s.peek()=='('){
    s.pop();
   }
   else if(ch=='}'&&s.peek()=='{'){
    s.pop();
   }
else if(ch==']'&&s.peek()=='['){
s.pop();
}
else{
    return false;
}

}

}
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String pran = "((({[]{}})({[]}))))";
        System.out.println(validPranthesis(pran));
    }
}
