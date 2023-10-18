//package queue;
//
//import java.util.ArrayList;
//
//public class DequeueImplementationArray {
//    public static class DequeueA{
//        ArrayList<Integer> arr = new ArrayList<>();
//        int f = -1;
//        int r = -1;
//        int size = 0;
//        public void add(int val){
//            if (size==0){
//                f=r=0;
//                arr.set(0, val);
//            } else if (size==arr.length {
//                System.out.println("Queue is full");
//                return;
//            } else if (r==arr.length-1) {
//                r=0;
//                arr.set(0,val)=val;
//            }
//            else{
//                arr[++r]=val;
//            }
//            size++;
//        }
//        public void addLast(int val){
//            add(val);
//        }
//        public void addFirst(int val){
//            if (size==0){
//                f=r=0;
//                arr[0]=val;
//            } else if (size==arr.length) {
//                System.out.println("Queue is full");
//                return;
//            }
//        }
//        public int remove() throws Exception{
//            if (size==0){
//                throw new Exception("Queue is empty !");
//            } else if (f==arr.length-1) {
//                int x=arr[f];
//                f=0;
//                size--;
//                return x;
//            } else {
//                int x = arr[f];
//                f = f+1;
//                size--;
//                return x;
//            }
//        }
//        public  void display() throws Exception{
//            if (size==0){
//                throw new Exception("Queue is Empty !!");
//            } else if (f<=r) {
//                for (int i=f;i<=r;i++){
//                    System.out.print(arr[i]+" ");
//                }
//                System.out.println();
//            } else if (r<f){
//                for (int i=f;i<arr.length;i++){
//                    System.out.print(arr[i]+" ");
//                }
//                for (int j=0;j<=r;j++){
//                    System.out.print(arr[j]+" ");
//                }
//                System.out.println();
//            }
//        }
//        public int peek() throws Exception{
//            if (size==0){
//                throw new Exception("Queue is Empty !!");
//            }
//            return arr[f];
//        }
//    }
//    public static void main(String[] args) throws Exception{
//        DequeueA q = new DequeueA();
//        q.add(3);
//        q.add(32);
//        q.add(35);
//        q.display();
//        q.addLast(1);
//        q.display();
//    }
//}
