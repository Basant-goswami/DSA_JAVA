package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_algo {

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
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,3,30));
        graph[0].add(new Edge(0,2,15));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,2,50));
    }

    public static class Pair implements Comparable<Pair>{
        int n;
        int path;
        Pair(int n,int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static int Prims(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
         boolean vis[] = new boolean[graph.length];
         int totalCost = 0;
//         ArrayList<Integer> ans = new ArrayList<>();      ---> for finding a edge

         pq.add(new Pair(0,0));

         while (!pq.isEmpty()){
             Pair curr = pq.remove();

             if(!vis[curr.n]) {
                 vis[curr.n] = true;
//                 ans.add(curr.n);         -->  for finding a edges
                 totalCost += curr.path;
                 for (int i = 0; i < graph[curr.n].size(); i++) {
                     Edge e = graph[curr.n].get(i);
                     pq.add(new Pair(e.dst, e.wt));
                 }
             }
         }
         //  --> for finding a prims edges that gives a minimum cost
//         for (int i=0;i<ans.size();i++){
//             System.out.print(ans.get(i) + " ");
//         }
//        System.out.println();
         return totalCost;
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int ans = Prims(graph);
        System.out.println(ans);
    }
}
