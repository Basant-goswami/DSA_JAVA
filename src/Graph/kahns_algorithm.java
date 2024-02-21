package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// kahn's algorithm (topological sort) using bfs and in-degree array
public class kahns_algorithm {
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
    public static void genindeg(ArrayList<Edge> graph[],int indeg[]){
        for (int i=0;i<graph.length;i++){
            for (int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                indeg[e.des] ++;
            }
        }
    }
    public static void topoSearch(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        genindeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();
        // indeg 0 wala ko add kar diya
        for (int i=0;i<indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        // bfs
        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for (int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.des] --;
                if(indeg[e.des] == 0){
                    q.add(e.des);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        graphImp(graph);
        topoSearch(graph);
    }
}

