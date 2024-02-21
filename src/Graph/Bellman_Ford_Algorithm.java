package Graph;

import java.util.ArrayList;

public class Bellman_Ford_Algorithm {

    public static class Edge{
        int src;
        int dst;
        int wt;
        Edge(int s,int d, int w){
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }
    public static void impGraph(ArrayList<Edge> graph){
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));
        graph.add(new Edge(1,2,-4));
        graph.add(new Edge(2,3,2));
        graph.add(new Edge(3,4,4));
        graph.add(new Edge(4,1,-1));
    }
    // algo --> bellman ford
    public static void bellman(ArrayList<Edge> graph,int src, int vtx){
        int dist[] = new int[vtx];
        for (int i=0;i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // traversing vertex-1 times outer loop
        for (int i=0;i<vtx-1;i++){
            // inner loop for finding all the sortest path in first traversal
            for (int j=0; j<graph.size(); j++){
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dst;
                int w = e.wt;

                // relaxation
                if (dist[u] != Integer.MAX_VALUE && (dist[u]+ w < dist[v])){
                    dist[v] = dist[u] + w;
                }
            }
        }
        for (int i=0;i<dist.length;i++){
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        impGraph(graph);
        bellman(graph,0,5);
    }
}
