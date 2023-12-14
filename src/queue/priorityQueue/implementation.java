package queue.priorityQueue;

import java.util.PriorityQueue;

public class implementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(13);
        pq.add(6);
        pq.add(2);
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("abc");
        pq1.add("ABC");
        pq1.add("abuse");
        pq1.add("cat");

        while (!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}
