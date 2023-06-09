import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ch_37_15_kruskal_algo {
    static class Edge implements Comparable<Edge>{
        int src;
        int dec;
        int wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dec = d;
            this.wt = w;
        }
        public int compareTo(Edge e2){
            return this.wt-e2.wt; // sorting base on the weight
        }
    }
    public static void createGraph(ArrayList<Edge>edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));

    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n]; // initlize with zero
    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x==par[x]){
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA]==rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){
            par[parA] = parB;
        }
        else{
            par[parB] = parA;
        }
    }

    public static void kruskalMST(ArrayList<Edge>edges , int V){
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;// for track how many vertex are connect

        for(int i=0;count<V-1;i++){
            Edge e = edges.get(i); // (src, dec, wt)
            int parA = find(e.src); // a
            int parB  = find(e.dec); //b

            if(parA!=parB){ // avoid cycle condition
                union(e.src , e.dec);
                mstCost+=e.wt;
                count++;
            }
        }

        System.out.println("Minimum cost of Kruskal MST is : " +mstCost);

    }
    public static void main(String[] args) {
            ArrayList<Edge>edges = new ArrayList<>();
            createGraph(edges);
            int v =4;
            kruskalMST(edges,v);



    }
}
