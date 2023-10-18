package queue;

public class queueImp {
    public static class queueA{
        int[] arr = new int[10];
        int f = -1;
        int r = -1;
        int size = 0;
        public void add(int val){
            if (size == arr.length){
                System.out.println("Queue is Full");
            }
            if (f == -1){
                f = r = 0;
                arr[0] = val;
            } else {
                arr[r+1] = val;
                r++;
            }
            size++;
        }
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
                f = f+1;
                size--;
                return arr[f - 1];
        }
        public int peek(){
            return arr[f];
        }
        void display(){
            if (size==0){
                System.out.println("Queue is empty");
                return;
            } else {
                for (int i = f; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            } else {
                return false;
            }
        }
        public int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(13);
        q.add(36);
        q.add(3);
        System.out.println(q.peek());
        q.display();

    }
}
