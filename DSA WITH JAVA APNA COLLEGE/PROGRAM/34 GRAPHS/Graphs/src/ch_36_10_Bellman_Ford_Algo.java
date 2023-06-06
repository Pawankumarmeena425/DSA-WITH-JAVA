import java.util.ArrayList;
import java.util.PriorityQueue;

public class ch_36_10_Bellman_Ford_Algo {
    static class Edge{
        int src;
        int dec;
        int wt;
        Edge(int src , int dec ,  int wt){
            this.src = src;
            this.dec = dec;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
    public static void createGraph2(ArrayList<Edge>graph){
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));

        graph.add(new Edge(1,2,-4));

        graph.add(new Edge(2,3,2));

        graph.add(new Edge(3,4,4));

        graph.add(new Edge(4,1,-1));
    }

    public static void bellmanFord(ArrayList<Edge>graph[] , int src){
        int dist[] = new int[graph.length];

        for (int i=0;i<graph.length;i++){
            if(i!=src){ // source value always initlize with zero
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;

        // algo - O(V*E)
        for(int iter=0;iter<V-1;iter++){ // O(V)

            for(int i=0;i<graph.length;i++){ // O(E)
                for(int j=0;j<graph[i].size();j++){
                    Edge curr = graph[i].get(j);
                    int u = curr.src;
                    int v = curr.dec;
                    int wt = curr.wt;
//                Relexation Step
                    if(dist[u]+wt < dist[v]){
                        dist[v]  =dist[u]+wt;
                    }
                }
            }

        }


//        Print
        for (int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }

    public static void bellmanFord2(ArrayList<Edge>graph , int src , int V){
        int dist[] = new int[V];

        for (int i=0;i< dist.length;i++){
            if(i!=src){ // source value always initlize with zero
                dist[i] = Integer.MAX_VALUE;
            }
        }


        // algo - O(V*E)
        for(int iter=0;iter<V-1;iter++){ // O(V)
            for(int j=0;j<graph.size();j++){//O(E)
                    Edge curr = graph.get(j);
                    int u = curr.src;
                    int v = curr.dec;
                    int wt = curr.wt;
//                Relexation Step
                    if(dist[u]+wt < dist[v]){
                        dist[v]  =dist[u]+wt;
                    }
            }

        }


//        Print
        for (int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int v =5;
    ArrayList<Edge>graph[] = new ArrayList[v];
    createGraph(graph);
    bellmanFord(graph,0);
        System.out.println();
//    Modified code , time complexity still remain same
        ArrayList<Edge>edge = new ArrayList<>();
        createGraph2(edge);
        bellmanFord2(edge,0,v);
    }
}
