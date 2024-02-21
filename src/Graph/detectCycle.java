package Graph;

import java.util.ArrayList;

public class detectCycle {
    public static class Edge{
        int src;
        int des;
        Edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }
    public static void graphImp(ArrayList<Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // vertex 0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        // vertex 1
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        // vertex 2
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));
        // vertex 3
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        // vertex 4
        graph[4].add(new Edge(4,3));
    }
    public static boolean dfsUtils(ArrayList<Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            boolean[] vis = new boolean[graph.length];
            if(dfsUtilsCycle(graph,vis,i,-1)){
                return true;
            }
        }
        return false;
    }
    public static boolean dfsUtilsCycle(ArrayList<Edge>[] graph,boolean vis[],int curr,int par){
        vis[curr] = true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                if(dfsUtilsCycle(graph,vis,e.des,curr)){
                    return true;
                }
            }
            else if(vis[e.des] && (e.des != par)){
                return true;
            }

        }
         return false;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        graphImp(graph);
        System.out.println(dfsUtils(graph));

    }
}
