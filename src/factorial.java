import java.util.Scanner;

public class factorial {

    // using recursion

//    public static int Factorial(int n){
//        if (n==0 || n==1) return 1;
//        return n*Factorial(n-1);
//    }

    public static int Factorial(int n){
        if(n==1 || n==0) return 1;
        int res = 1;
        for (int i=n;i>=1; i--){
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
}
