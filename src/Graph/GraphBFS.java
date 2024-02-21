package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
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
        // vertex 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,2));
        graph[1].add(new Edge(1,3,4));

        // vertex 2
        graph[2].add(new Edge(2,1,2));
        graph[2].add(new Edge(2,3,7));
        graph[2].add(new Edge(2,4,3));

        // vertex 3
        graph[3].add(new Edge(3,2,7));
        graph[3].add(new Edge(3,1,4));

        // vertex 4
        graph[4].add(new Edge(4,2,3));
    }

    /*
          (5)
        0-----1
             / \
      (2)   /   \(4)
           2-----3
           | (7)
       (3) |
           4

         */
    public static void bfs (ArrayList<Edge> graph[]){

        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[graph.length];
        q.add(0);   // initially we are going to start with 0 (we can start with any vertex)
        while (!q.isEmpty()){
            int curr = q.remove();
            if (!isVisited[curr]) {
                System.out.print(curr + " ");
                isVisited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        GraphImp(graph);
        System.out.println("the bfs graph is :");
        bfs(graph);
    }
}
