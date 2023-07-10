import java.util.ArrayList;

public class ch_34_00_Creating_Graphs {
    public static class Edge{
        int src;int dec;
        int wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.dec = d;
            this.wt = w;

        }
    }

    public static void main(String[] args) {

        int v = 5;//number of veritces
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0;i<v;i++){ // initial graph[i] is fill with 0
            graph[i] = new ArrayList<>();
        }

//        0-vertix
        graph[0].add(new Edge(0,1,5));
//        1 Vertix
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
//        2 Vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

//        3 Vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

//        4 Vertex
        graph[4].add(new Edge(2,1,1));

//        Print 2's neighbors vertex
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dec);
        }

    }
}
