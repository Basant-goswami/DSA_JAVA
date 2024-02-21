package Graph;

import java.util.ArrayList;

public class GraphDFS {

    static class Edge{
        int src;
        int dst;
        int wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void GraphImp(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // vertex 0
        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0,2,5));
        // vertex 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,2));
        // vertex 2
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,4,3));

        // vertex 3
        graph[3].add(new Edge(3,1,7));
        graph[3].add(new Edge(3,4,4));
        graph[3].add(new Edge(3,5,4));

        // vertex 4
        graph[4].add(new Edge(4,2,3));
        graph[4].add(new Edge(4,3,3));
        graph[4].add(new Edge(4,5,3));
        // vertex 5
        graph[5].add(new Edge(4,3,3));
        graph[5].add(new Edge(4,4,3));
        graph[5].add(new Edge(4,6,3));
        // vertex 7
        graph[6].add(new Edge(6,5,5));
    }

    public static void dfs(ArrayList<Edge> graph[],int src, boolean visited[]){
        if(visited[src]){
            return;
        }
        visited[src] = true;
        System.out.print(src +" ");
        for (int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dst]){
                dfs(graph,e.dst,visited);
            }
        }
    }

    public static void main(String[] args) {
        int v =  7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        GraphImp(graph);
        boolean[] visited = new boolean[graph.length];
        dfs(graph,0,visited);




    }
}
