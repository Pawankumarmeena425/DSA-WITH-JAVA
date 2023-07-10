import java.util.ArrayList;
import java.util.PriorityQueue;

public class ch_36_09_Dijakstra_algo {

    public static class Edge{
        int src;
        int dec;
        int w;
        public Edge(int s, int d,int wt){
            this.src = s;
            this.dec = d;
            this.w = wt;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; // path based sorting for my pairs
        }
    }

    public static void dijkstra(ArrayList<Edge>graph[] , int src){
        int dist[] = new int[graph.length]; // contains destance form source to ith node
        boolean vis[] = new boolean[graph.length];
        for (int i=0;i<graph.length;i++){
            if(i!=src){ // for source distance is initalize with zero
                dist[i] = Integer.MAX_VALUE; // initilize with infinite value
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        // loop
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dec;
                    int wt = e.w;


                    if(dist[u]+wt <dist[v]){
                        dist[v]  = dist[u]+wt;
                        pq.add(new Pair(v , dist[v]));
                    }
                }
            }
        }


//        Print all source to vertices shortest dist
        for(int i=0;i<dist.length;i++){
            System.out.println(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int v = 6;
    ArrayList<Edge>graph[]  = new ArrayList[v];
    creatGraph(graph);
    int src = 0;
    dijkstra(graph,src);
    }
}
