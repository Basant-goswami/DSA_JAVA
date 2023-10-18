import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till you want to print Fibonacci series: ");
        int n = sc.nextInt();
        int num1 = 0 ;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 +" ");
        System.out.print(num2+" ");
        for (int i=0; i<n-2; i++){
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3+" ");
        }
    }
}
