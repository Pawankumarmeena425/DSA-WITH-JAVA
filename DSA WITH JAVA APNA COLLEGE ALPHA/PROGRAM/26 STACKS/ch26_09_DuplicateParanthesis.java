import java.util.Stack;

public class ch26_09_DuplicateParanthesis {
    public static boolean duplicate(String par) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < par.length(); i++) {
            int count = 0;
            char ch = par.charAt(i);
            // Push opening brackets , operands and operator in the stack
            if (ch != ')' && ch != '}' && ch != ']') {
                s.push(ch);
            }
            // When closing brackets occurs

            else {
                while (!s.isEmpty()) {
                    if (ch == ')' && s.peek() == '(') {
                        s.pop();
                        if (count < 1) {
                            return false;
                        }
                        break;

                    } else if (ch == '}' && s.peek() == '{') {
                        s.pop();
                        if (count < 1) {
                            return false;
                        }
                        break;

                    } else if (ch == ']' && s.peek() == ']') {
                        s.pop();
                        if (count < 1) {
                            return false;
                        }
                        break;

                    } else {
                        s.pop();
                        count++;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String par = "((a+b)+(c+d))}";
        System.out.println(duplicate(par));
    }
}
