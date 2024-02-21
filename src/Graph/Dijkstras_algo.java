package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_algo {

    public static class Edge{
        int src;
        int dst;
        int wt;
        Edge(int s,int d,int wt){
            this.src = s;
            this.dst = d;
            this.wt = wt;
        }
    }
    // ye compair kar ke shortest path wale ko queue me aage kar dega (priority queue)
    public static class Pair implements Comparable<Pair> {
        int n;
        int path;
        Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo (Pair p2){
            return this.path - p2.path;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,5,5));
        graph[4].add(new Edge(4,3,2));
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for (int i=0;i< graph.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                // neighbours
                for (int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int U = e.src;
                    int V = e.dst;
                    int w = e.wt;

                    if (dist[U]+ w < dist[V]){
                        dist[V] = dist[U] + w;
                        pq.add(new Pair(V,dist[V]));
                    }
                }
            }
        }

        for (int i=0;i< dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dijkstra(graph,0);
    }
}
