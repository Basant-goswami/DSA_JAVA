package Advance_java;

public class thread_Synchronization {
    // method
    public static class multiply {
    //  public synchronized void getMultiply(int n) {   --> ye poore method ko synchronized kar dega
        public void getMultiply(int n) {
            // it will only synchronized the particular code
            synchronized (this) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i * n);
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }

    public static class Thread1 extends Thread{
        multiply mu;
        Thread1(multiply mu){
            this.mu = mu;
        }
        @Override
        public void run(){
            try{
                mu.getMultiply(2);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static class Thread2 implements Runnable{
        multiply mu;
        Thread2(multiply mu){
            this.mu = mu;
        }
        @Override
        public void run(){
            try {
                mu.getMultiply(3);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        multiply obj = new multiply();
        Thread1 t1 = new Thread1(obj);
        t1.start();
        Thread t2 = new Thread(new Thread2(obj));
        t2.start();

    }
}
