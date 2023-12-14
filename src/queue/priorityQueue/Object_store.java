package queue.priorityQueue;

import java.util.PriorityQueue;

public class Object_store {

    public static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // creating a class & object and setting priority according to the objects
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A",3));
        pq.add(new Student("B",6));
        pq.add(new Student("C",1));
        pq.add(new Student("J",5));
        pq.add(new Student("X",2));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name +"-> " + pq.peek().rank);
            pq.remove();
        }
    }
}
