import java.util.ArrayList;
import java.util.Stack;

public class ch_36_16_Strongly_Connacted_Kosarajus_Algorithim {

    public static class Edge{
        int src;
        int dec;
        Edge(int src,int dec){
            this.src = src;
            this.dec  =dec;
        }
    }
    public static void creatGraph(ArrayList<Edge>graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));

    }
    public static void topSort(ArrayList<Edge>graph[] , int curr ,boolean vis[],Stack<Integer>s){
        vis[curr]  =true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dec]){
                topSort(graph , e.dec,vis,s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>graph[] , int curr , boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dec]){
                dfs(graph,e.dec,vis);
            }
        }
    }
    public static void kosarajuAlgo(ArrayList<Edge>graph[] , int V){
//        Step 1 : topologic Sorting
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph , i , vis,s);
            }
        }


//        Step 2 : tranpose the graph
        ArrayList<Edge>transpose[] = new ArrayList[V];
        for(int i=0;i<V;i++){
            vis[i] = false; // for fruther use
            transpose[i] = new ArrayList<>();
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j); //e.src --> e.dec
                transpose[e.dec].add(new Edge(e.dec,e.src)); // transpose
            }
        }

//Step 3 : topologic sorting on the transpose graph
        while(!s.isEmpty()){
            int curr  = s.pop();
            if(!vis[curr]){
                System.out.print("SCC -->> ");
                dfs(transpose , curr , vis);
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
    int V =5;
    ArrayList<Edge>graph[] = new ArrayList[V];
    creatGraph(graph);
    kosarajuAlgo(graph,V);
    }
}
