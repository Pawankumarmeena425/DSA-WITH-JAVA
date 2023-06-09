import java.util.PriorityQueue;

public class ch_36_13_connecting_cities {
    static class Edge implements Comparable<Edge>{
        int dec;
        int cost;
        Edge(int d , int c){
            this.dec = d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost;
        }
    }
    public static int connectingCities(int cities[][] ){
        boolean vis[] = new boolean[cities.length];
        int totalCost=0;
        PriorityQueue<Edge>pq = new PriorityQueue<>();
        pq.add(new Edge(0,0));

        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!vis[curr.dec]){
                vis[curr.dec] = true;
                totalCost+=curr.cost;
                for(int i=0;i<cities[curr.dec].length;i++){
                    if(cities[curr.dec][i]!=0){
                        pq.add(new Edge(i  , cities[curr.dec][i]));
                    }
                }
            }
        }



        return totalCost;
    }
    public static void main(String[] args) {
        int cities[][] = {{0,1,2,3,4},
                {1,0,5,0,7},
                {2,5,0,6,0},
                {3,0,6,0,0},
                {4,7,0,0,0}};
        System.out.println(connectingCities(cities));
    }
}
