package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
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
//        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,2));
        // vertex 1
        graph[1].add(new Edge(1,0));
//        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        // vertex 2
//        graph[2].add(new Edge(2,1));
//        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,0));
        // vertex 3
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
//        graph[3].add(new Edge(3,0));
//        graph[3].add(new Edge(3,2));
        // vertex 4
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
    }
    public static boolean bfsBipartite(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        int[] color = new int[graph.length];
        for (int j=0;j<color.length;j++){
            color[j] = -1;
        }
        for (int i=0;i<graph.length;i++){   // bfs for all connected or non connected graphs
            if(color[i]==-1){
                q.add(i);
                color[i] = 0;   // yellow
                while (!q.isEmpty()){            // bfs main
                    int curr = q.remove();
                    for (int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(color[e.dst]==-1){
                            q.add(e.dst);
                            color[e.dst] = color[curr] ==0 ? 1 : 0;
                        } else if(color[e.dst] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v = 5 ;
        ArrayList<Edge>[] graph = new ArrayList[v];
        graphImp(graph);
        System.out.println(bfsBipartite(graph));

    }
}
