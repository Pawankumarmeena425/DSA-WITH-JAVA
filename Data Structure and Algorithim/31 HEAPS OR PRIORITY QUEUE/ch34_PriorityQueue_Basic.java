import java.util.PriorityQueue;

public class ch34_PriorityQueue_Basic {

    static class Students implements Comparable<Students> {
        int rank;
        String name;

        public Students(int rank, String name) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Students s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // Priority Queue implementation
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(9);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        // Priority queue using objects
  PriorityQueue<Students> ps = new PriorityQueue<>();
ps.add(new Students(2, "B"));
ps.add(new Students(4, "A"));
ps.add(new Students(7, "C"));
ps.add(new Students(8, "D"));
ps.add(new Students(0, "D"));


while(!ps.isEmpty()){
    System.out.println(ps.peek().rank+"-->>"+ps.peek().name);
    ps.remove();
}

    }
}