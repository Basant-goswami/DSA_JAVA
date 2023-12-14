package queue.priorityQueue;
import java.util.*;

public class Connect_N_ropes {

    public static void main(String[] args) {
        // given size of ropes
        int arr[] = {3,3,2,6,4};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int cost = 0;
        while (pq.size()>1){
            int m1 = pq.remove();
            int m2 = pq.remove();
            cost += m1+m2;
            pq.add(m1+m2);
        }

        System.out.println("the total min cost to connect n ropes is : " + cost);
    }
}
