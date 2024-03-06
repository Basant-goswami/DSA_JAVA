package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class kruskals_algo {

    public static class Edge implements Comparable<Edge>{
        int src;
        int dst;
        int wt;
        Edge(int s,int d,int wt){
            this.src = s;
            this.dst = d;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    //  graph --> stores edges only
    public static void gen_graph(ArrayList<Edge> graph){
        graph.add(new Edge(0,1,10));
        graph.add(new Edge(0,2,15));
        graph.add(new Edge(1,3,40));
        graph.add(new Edge(2,3,50));
        graph.add(new Edge(0,3,30));
    }

    //  Disjoint set DS implementation
    static int v = 4;
    static int[] par = new int[v];
    static int[] rank = new int[v];
    
    public static void init(){
        for (int i=0;i<v;i++){
            par[i] = i;
        }
    }
    // find method
    public static int find(int x){
        if(par[x] == x){
            return x;
        }
        return par[x] = find(par[x]);
    }
    // union method
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA] ++;
        } else if (rank[parA] > rank[parB]) {
            par[parB] = parA;
        }
        else {
            par[parA] = parB;
        }
    }

    //      main kruskal method
    public static void kruskal(ArrayList<Edge> edges,int v){
        Collections.sort(edges);
        int minWeight = 0;
        int count = 0;

        for (int i=0; count<v-1; i++){
            Edge e = edges.get(i);
            int parA = find(e.src);     // par of a
            int parB = find(e.dst);     // par of b
            if(parA != parB){
                union(e.src,e.dst);
                count++;
                minWeight += e.wt;
            }
        }
        System.out.println(minWeight);
    }
    
    public static void main(String[] args) {
        int v = 4;
        init();
        ArrayList<Edge> edges = new ArrayList<>();
        gen_graph(edges);
        kruskal(edges,v);
    }
}
