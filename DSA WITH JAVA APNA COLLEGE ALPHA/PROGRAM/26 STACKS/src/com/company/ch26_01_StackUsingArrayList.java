import java.util.ArrayList;
// Now its work fine
class Stack {
    
    ArrayList<Integer> list = new ArrayList<>();

     public boolean isEmpty() {
         return list.size() == 0;
     }

     // Push operation
     public void push(int num) {
         list.add(num);
     }

     // Pop Operation
     public int Pop() {
         if (isEmpty()) {
             return -1;
         }
         int val = list.get(list.size() - 1);
         list.remove(list.size() - 1);
         return val;
     }

     // Peek Operation(kewal jankna , delete nahi karna)
     public int peek() {
         if (isEmpty()) {
             return -1;
         }
         return list.get(list.size() - 1);
     }

 }

public class ch26_01_StackUsingArrayList {
    // Static because we create class in the another class
    // It work fine if we create it outside this class , and access through object creation
    static class Stack {
    
       ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push operation
        public void push(int num) {
            list.add(num);
        }

        // Pop Operation
        public int Pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek Operation(kewal jankna , delete nahi karna)
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.Pop();
        }
    }
}
