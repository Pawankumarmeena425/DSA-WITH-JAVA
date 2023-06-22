import java.util.ArrayList;

public class ch34_01_heapsUsingAL {
    public static class Heap {

        ArrayList<Integer> list = new ArrayList<>();

        public void add(int val) {
            // add at the last index
            list.add(val);
            int x = list.size() - 1;
            int parent = (x - 1) / 2;
            
            // Sweaping 
            while (list.get(x) < list.get(parent)) {
                int temp = list.get(x);
                list.set(x, list.get(parent));
                list.set(parent, temp);
                x = parent;
                parent = (x - 1) / 2;
            }
        }
public int peek(){
    return list.get(0);
}
public int remove(){
  
}

    }

    public static void main(String[] args) {
Heap h = new Heap();
h.add(5);
h.add(2);
h.add(8);
h.add(3);
h.add(1);
System.out.println(h.list);
    }
}