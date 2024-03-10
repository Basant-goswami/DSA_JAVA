package Advance_java;

public class Threads_demo {
    public static class Thread1 extends Thread{
            @Override
            public void run() {
                try {
                    System.out.println("Thread1 is running");
                } catch (Exception e) {
                    System.out.println("Exception raised " + e);
                }
            }
    }

    // we can also implements thread using Runnable interface
    public static class Thread2 implements Runnable{
        @Override
        public void run(){
            try {
                System.out.println("Thread2 is running");
            } catch (Exception e){
                System.out.println("Exception executed" + e);
            }
        }
    }

    // line se execute nahi hoga jab cpu me khali hoga tab thread run ho jayega
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Thread1 t1 = new Thread1();
            t1.start();
            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}
