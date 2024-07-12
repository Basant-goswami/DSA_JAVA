import java.util.Scanner;

public class fibonacciRec {
    static int n1 =0, n2=1,n3 =0;
    // first method
        public static void fibonacci(int n){
            if (n>0){
                n3 = n1+n2;
                n1 = n2;
                n2 = n3;
                System.out.print(n3+" ");
                fibonacci(n-1);
            }
        }
        // second method
    public static int fibonacci_2(int n){
        if (n<=1) return n;
        return fibonacci_2(n-1)+fibonacci_2(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
//        System.out.print(n1+" ");
//        System.out.print1(n2+" ");
//        fibonacci(n-2);

        for (int i=0;i<n;i++){
            System.out.print(fibonacci_2(i)+" ");
        }
    }
}
