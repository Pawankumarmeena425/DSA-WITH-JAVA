import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ch_35_07_topological_sorting_using_bfs {
    public static class Edge{
        int src;
        int dec;
        public Edge(int s, int d){
            this.src = s;
            this.dec = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void indegree(ArrayList<Edge>[] graph , int []indeg){
        for(int i=0;i<graph.length;i++){
        int curr = i;
        for(int j=0;j<graph[curr].size();j++){
            Edge e= graph[curr].get(j);
            indeg[e.dec]++;
        }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph){
        Queue<Integer>q = new LinkedList<>();
        int indeg[] = new int[graph.length];
        indegree(graph,indeg);

//        add vertex indegree with 0
        for(int i=0;i< graph.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
//perform bfs
        while(!q.isEmpty()){
            int curr =  q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.dec]--;
                if(indeg[e.dec]==0){
                    q.add(e.dec);
                }
            }
        }

    }
    public static void main(String[] args) {
        int v = 6;
    ArrayList<Edge> [] graph = new ArrayList[v];
    createGraph(graph);
    topSort(graph);

    }
}
