package queue;

public class LLImplementationOfQueue {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLImpQueue{
        Node head = null;
         Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if (size == 0){
                head=tail=temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int remove(){
            if (size==0) {
                System.out.println("The queue is Empty!!");
                return -1;
            }
            int re = head.val;
            head = head.next;
            size--;
            return re;
        }
        public int peek(){
            if (size==0){
                System.out.println("Empty queue!!");
                return -1;
            }
            return head.val;
        }
        public int size(){
            return size;
        }

        public void display(){
            if (size==0){
                System.out.println("Empty queue!!");
                return;
            }
            Node display = head;
            for (int i=0; i<size; i++){
                System.out.print(display.val+" ");
                display = display.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        LLImpQueue q1 = new LLImpQueue();
        q1.add(13);
        q1.add(3);
        q1.add(23);
        q1.add(43);
        q1.display();
        System.out.println(q1.remove());
    }
}
