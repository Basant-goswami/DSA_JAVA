package Graph;

import java.util.ArrayList;

public class detectCycleDirectedGraph {
    public static class Edge{
        int src;
        int dst;
        Edge(int s,int d){
            this.src = s;
            this.dst = d;
        }
    }
    public static void graphImp(ArrayList<Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // vertex 0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        // vertex 1
        graph[1].add(new Edge(1,3));
        // vertex 2
        graph[2].add(new Edge(2,3));
        // vertex 3
    }
    public static boolean CycleDetect(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for (int i=0;i<graph.length;i++){
            if(!vis[i]) {
                if (CycleDetectUtil(graph, vis, stack, i)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean CycleDetectUtil(ArrayList<Edge>[] graph,boolean vis[],boolean stack[],int curr){
        vis[curr] = true;
        stack[curr] = true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (stack[e.dst] == true){
                return true;
            } else if (!vis[e.dst] && (CycleDetectUtil(graph,vis,stack,e.dst))){
                   return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        graphImp(graph);
        System.out.println(CycleDetect(graph));
    }
}
