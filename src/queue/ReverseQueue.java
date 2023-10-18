package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q);
//  reversing k elements in the queue
        int k = 4;
        int n = q.size();
        Stack<Integer> s = new Stack<>();
        for (int i=0;i<k; i++){
            s.push(q.remove());
        }
        while (s.size()>0){
            q.add(s.pop());
        }
        for (int j=0; j<n-k; j++){
            q.add(q.remove());
        }
        System.out.println(q);
        int c = 0;
    }
}
