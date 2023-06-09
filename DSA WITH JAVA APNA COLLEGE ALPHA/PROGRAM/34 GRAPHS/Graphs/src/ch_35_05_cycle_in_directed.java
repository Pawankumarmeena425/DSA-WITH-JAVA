import java.util.ArrayList;

public class ch_35_05_cycle_in_directed {
    public static class Edge{
        int src;
        int dec;
        public Edge(int s,int d){
            this.src =s;
            this.dec = d;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph){
        for (int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }

//        Cycle  not exists
//        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,2));
//        graph[1].add(new Edge(1,3));
//        graph[2].add(new Edge(2,3));


//      cycle exists
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }
    public static boolean isCycle(ArrayList<Edge> [] graph)
    {
        boolean vis[] = new boolean[graph.length];
                boolean stack[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
               if (isCycleUtil(graph, i, vis, stack)){
                   return true;
               }

            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph , int curr, boolean vis[] , boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dec]){//cycle exist
                return true;
            }
            else if(!vis[e.dec] && isCycleUtil(graph, e.dec, vis, stack)){
                return true;
            }
        }
        stack[curr]  = false;
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
