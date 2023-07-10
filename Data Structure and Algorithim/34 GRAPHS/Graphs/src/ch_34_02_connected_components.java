import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ch_34_02_connected_components {
    public static class Edge{
        int src;int dec;

        Edge(int s,int d,int w){
            this.src = s;
            this.dec = d;


        }
    }
    public static void dfs(ArrayList<Edge> [] graph){
        boolean vis[]  =new boolean[graph.length];
        for (int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfsUtil(graph,i,vis);
            }

        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph , int curr , boolean vis[]){
//        visit current
        System.out.print(curr+" ");
        vis[curr]  =true;

        for(int i=0;i<graph[curr].size();i++){//call for neighbours
           Edge e = graph[curr].get(i);
            if(!vis[e.dec]){
                dfsUtil(graph,e.dec,vis);
            }

        }
    }
    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList< Edge >[]graph , boolean vis[]){ //O(V+E) -->>O(n)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //source =0
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){ //visit curr
                System.out.print(curr +" ");
                vis[curr] = true;
//                add all neighbours in queue
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dec);
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
