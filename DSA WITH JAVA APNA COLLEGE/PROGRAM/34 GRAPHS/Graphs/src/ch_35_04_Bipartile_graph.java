import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ch_35_04_Bipartile_graph {
    public static class Edge{
        int src;int dec;
        public Edge(int s, int d){
            this.src =s;
            this.dec =d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2 ,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int color [] = new int[graph.length];
        for (int i=0;i<color.length;i++){
            color[i] = -1;
        }
        Queue<Integer>q = new LinkedList<>();

        for(int i=0;i<graph.length;i++){
                   if(color[i]==-1){//BFS Perform ,  same as connected graph
                       q.add(i);
                       color[i]=0;//yellow

//                       now run for one component of graph
                   while(!q.isEmpty()){
                           int curr = q.remove();
                           for(int j=0;j<graph[curr].size();j++){
                               Edge e = graph[curr].get(j);//neighbours
//                               Case 1 : no color assign
                               if(color[e.dec] ==-1){
                                   int nextCol = color[curr]==0 ? 1:0;
                                   color[e.dec] = nextCol;
                                   q.add(e.dec);
                               }
//                               Case 2:
                               else if(color[e.dec] == color[curr]){
                                   return false; // NOt bipartite
                               }
//                               Case 3 : no action

                           }
                       }
                   }
        }
        return true;
    }
    public static void main(String[] args) {
//        if graph have no cycle then it is bipartile by defualt
        int v=5;
        ArrayList<Edge>graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
