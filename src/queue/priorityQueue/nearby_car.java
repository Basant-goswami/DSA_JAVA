package queue.priorityQueue;

import java.util.PriorityQueue;
// int this ques, find the nearest k car from origin and the 2d co-ordinates is given
public class nearby_car {
    static class point implements Comparable<point>{
        int x;
        int y;
        int disSqr;
        int idx;

        public point(int x,int y,int disSqr,int idx){
            this.x = x;
            this.y = y;
            this.disSqr = disSqr;
            this.idx = idx;
        }
        @Override
        public int compareTo(point p){
            return this.disSqr - p.disSqr;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;       // no of cars to find

        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            int disSqr = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
            pq.add(new point(arr[i][0],arr[i][1],disSqr,i));
        }

        // for first k nearest point
        System.out.println("the nearest car from origin is :");
        for (int i=0;i<k;i++){
            System.out.println("C" +pq.remove().idx);
        }
    }
}
