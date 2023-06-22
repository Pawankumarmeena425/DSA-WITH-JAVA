public class ch26_02_StackUsingLL {

    public static class Node {
        int data;
        Node next;

        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // By default head is initlize with null
    public static Node head;

    public static class Stack {

        public boolean isEmpty() {
            return head == null;
        }

        // push operation
        public void push(int data) {
            // creaat a newnode
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
newNode.next = head;
head = newNode;
        }

        // Pop Operation
        public int pop(){
            if(isEmpty()){
                return -1;
            }
int top = head.data;
head = head.next;
return top;
        }

        // Peek Operation
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
        public static void main(String[] args) {
            Stack s = new Stack();
s.push(1);
s.push(2);;
s.push(3);
s.push(4);
s.push(5);;
while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
}
        }
    }

