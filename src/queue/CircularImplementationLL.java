package queue;

public class CircularImplementationLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class CirQueLL{
        Node head=null;
        Node tail =null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if (size==0){
                head=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty !!");
            } else {
                int a = head.val;
                head = head.next;
                tail.next = head;
                size--;
                return a;
            }
        }
        public int peek() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty !!");
            } else {
                return head.val;
            }
        }
        public int size(){
            return size;
        }
        public void display() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty !!");
            } else {
                Node temp = head;
                for (int i=0;i<size;i++){
                    System.out.print(temp.val+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) throws Exception {
        CirQueLL q = new CirQueLL();
        System.out.println(q.isEmpty());
        q.add(32);
        System.out.println(q.peek());
        q.add(36);
        q.add(28);
        q.add(8);
        q.add(98);
        q.display();
        q.remove();
        System.out.println(q.peek());
        q.display();
        System.out.println(q.isEmpty());
    }
}
