public class ch_36_14_union_DS {
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n]; // initlize with zero
    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
    }

//    public static int find(int x){
//        if(x==par[x]){
//            return x;
//        }
//        return find(par[x]);
//    }

//   Optimizaton : Path Compression
public static int find(int x){
    if(x==par[x]){
        return x;
    }
    return  par[x] = find(par[x]);
//    now on the first time when it called, it all node sotres supreme parents , so whenever it call again , now it directly reach to the supreme parent , without iterate over all the nodes
}

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);


        if(rank[parA]==rank[parB]){
//            anyone can be leader , both rank are same
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){ // now parB become parents of parA
            par[parA] = parB;
//            not require to update rank , because no change in overall height
        }
        else{
            par[parB] = parA;
        }
    }


    public static void main(String[] args) {
    init();
    union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        union(1,5);

    }
}
