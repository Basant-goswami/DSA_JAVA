package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort_dfs {
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

        // vertex 1

        // vertex 2
        graph[2].add(new Edge(2,3));
        // vertex 3
        graph[3].add(new Edge(3,1));
        // vertex 4
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        // vertex 5
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topoSearch(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<graph.length;i++){
            if(!vis[i]){
                topoSearchUtil(graph,vis,st,i);
            }
        }
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    public static void topoSearchUtil(ArrayList<Edge>[] graph,boolean vis[],Stack<Integer> st,int curr){
        vis[curr] = true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                topoSearchUtil(graph,vis,st,e.des);
            }
        }
        st.push(curr);
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        graphImp(graph);
        topoSearch(graph);
    }
}
