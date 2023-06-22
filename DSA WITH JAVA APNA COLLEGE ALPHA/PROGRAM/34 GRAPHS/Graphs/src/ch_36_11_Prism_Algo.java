import java.util.ArrayList;
import java.util.PriorityQueue;

public class ch_36_11_Prism_Algo {
    static class Edge{
        int src;
        int dec;
        int wt;
        Edge(int src,int dec , int wt){
            this.src = src;
            this.dec = dec;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(1,0,10));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
        graph[3].add(new Edge(3,0,30));

    }
    public static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }

        public int compareTo(Pair p2){
            return this.cost - p2.cost; // Sorting base on acending order
        }
    }


    public static void prism_MST(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair>pq =  new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int totalCost = 0; // minimum cost / MST cost

        while(!pq.isEmpty()){
            Pair curr=  pq.remove(); // it will always give minimum cost value node
            if(!vis[curr.v]){
                vis[curr.v] = true;
                totalCost+= curr.cost;

//                Add all neighbour in the pq
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dec , e.wt));
                }
            }
        }

        System.out.println("Minimum cost of the spanning Tree (Total Cost): "+totalCost);


    }
    public static void main(String[] args) {
    int v = 4;
    ArrayList<Edge>graph[] = new ArrayList[v];
    createGraph(graph);
    prism_MST(graph);
    }
}
