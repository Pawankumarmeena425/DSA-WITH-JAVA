import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ch_34_01_BFS_DFS_and_hasPath {
    public static class Edge{
        int src;int dec;
        int wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.dec = d;
            this.wt = w;

        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }

    public static void bfs(ArrayList<Edge>[]graph){ //O(V+E) -->>O(n)
        Queue<Integer>q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
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

    public static void dfs(ArrayList<Edge>[] graph , int curr , boolean vis[]){
//        visit current
        System.out.print(curr+" ");
        vis[curr]  =true;

        for(int i=0;i<graph[curr].size();i++){//call for neighbours
            Edge e = graph[curr].get(i);
            if(!vis[e.dec]){ // here handle visited node case
                dfs(graph,e.dec,vis);
            }

        }
    }
    public static boolean hasPath(ArrayList<Edge> [] graph , int src, int dec, boolean vis[]){
        if(src==dec){
            return true;
        }
        vis[src]  = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
//            if(!vis[e.dec]){
//               if (hasPath(graph,e.dec,dec,vis)){
//                    return true;
//                }
//            }
            if(!vis[e.dec] && hasPath(graph,e.dec,dec,vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> [] graph  = new ArrayList[v];
        creatGraph(graph);
        bfs(graph);
        System.out.println();
        dfs(graph,0,new boolean[v]);
        System.out.println(hasPath(graph,0,5,new boolean[v]));
    }
}
