import com.sun.source.tree.IfTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ch_36_12_Cheapest_flight_with_K_Stops {
    static class Edge{
        int src;
        int dec;
        int price;
        Edge(int src, int dec, int price){
            this.src = src;
            this.dec = dec;
            this.price = price;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[] , int flight[][]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i< flight.length;i++){
           int src = flight[i][0];
           int dec = flight[i][1];
           int price =  flight[i][2];

           graph[src].add(new Edge(src, dec, price));
        }
    }
    static class Info{
        int v;
        int cost;
        int stops;
        Info(int v, int c, int k){
            this.v = v;
            this.cost = c;
            this.stops = k;
        }
    }
    public static int cheapestFlight(int n , int flight[][],  int src, int dec, int k){
        ArrayList<Edge>graph[] = new ArrayList[n];
        createGraph(graph,flight);
        int dist[]  =new int[n];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]  =Integer.MAX_VALUE;
            }
        }
        Queue<Info>q = new LinkedList<>();
        q.add(new Info(src,0,0));;
        while(!q.isEmpty()){
            Info curr  = q.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dec;
                int wt = e.price;
//                if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v] && curr.stops<=k){
//                    dist[v] = dist[u]+wt;
//                    q.add(new Info(v,  dist[v] , curr.stops+1));
//                }

//                Corner Cases
                if( curr.cost+wt<dist[v] && curr.stops<=k){
                    dist[v] = curr.cost+wt;
                    q.add(new Info(v,  dist[v] , curr.stops+1));
                }

            }
        }


    if(dist[dec]==Integer.MAX_VALUE){
        return -1;
    }
    else {
        return dist[dec];
    }

    }
    public static void main(String[] args) {
        int flight[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dec=3,k=1;
        int n=4;
        System.out.println(cheapestFlight(n,flight,src,dec,k));

    }
}
