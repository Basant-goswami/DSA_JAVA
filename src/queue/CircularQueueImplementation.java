package queue;

public class CircularQueueImplementation {
    public static class CircularQue{
        int[] arr = new int[5];
        int size = 0;
        int f = -1;
        int r = -1;
        public void add(int val) throws Exception{
            if (size==0){
                f=r=0;
                arr[0]=val;
            } else if (size==arr.length) {
                throw new Exception("Queue is Full!");
            } else if (r==arr.length-1) {
                r=0;
                arr[0]=val;
            } else {
                arr[++r]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty");
            } else if (f==arr.length-1) {
                int x = arr[f];
                f = 0;
                size--;
                return x;
            }
            else {
                int x = arr[f];
                f = f+1;
                size--;
                return x;
            }

        }
        public int peek() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty!");
            }
            return arr[f];
        }
        public void display() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty!");
            }
            else if (f<=r){
                for (int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            } else if (r<=f){
                for (int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for (int j=0;j<=r;j++){
                    System.out.print(arr[j]+" ");
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
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) throws Exception {
        CircularQue q = new CircularQue();
        q.add(1);
        System.out.println(q.peek());
        q.add(2);
        q.add(3);
        q.add(5);
        q.remove();
        q.remove();;
        q.remove();
        q.add(10);
        q.add(3);
        q.display();

        System.out.println(q.peek());
//        q.add(12);
        System.out.println(q.size());
    }
}
