import java.util.ArrayList;
public class ch_36_17_Bridge_using_Tragan_Algo {
    public static class Edge{
        int src;
        int dec;
        Edge(int src,int dec){
            this.src = src;
            this.dec = dec;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[] , int V){
        for(int i=0;i<V;i++){
            graph[i]  =new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));

    }
    public static void dfs(ArrayList<Edge>graph[] , int curr , int  par , int dt[] , int low[] ,boolean vis[] , int time){
        vis[curr] = true;
        dt[curr]  =low[curr]  = ++time;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dec;
            if(neigh==par){
                continue;
            }
            else if(!vis[neigh]){
                dfs(graph,neigh,curr,dt,low,vis,time);
                low[curr] = Math.min(low[curr] , low[neigh]);
                if(dt[curr]<low[neigh]){  // Bridge condition
                    System.out.println("Bridge : "+curr+" --------- "+neigh);
                }
            }
            else{ // when vis[curr] == true
                low[curr]  =Math.min(low[curr] , dt[neigh]);
            }
        }
    }
    public static void targanBridge(ArrayList<Edge>graph[] , int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[]  = new boolean[V];
        int time = 0;

        for (int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,-1,dt,low,vis,time);
            }
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph,V);
        targanBridge(graph,V);
    }
}
