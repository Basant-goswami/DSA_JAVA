package Patterns;

import java.util.Scanner;

public class check_PrimeNumber {
    private static boolean primeCheck(int num){
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(primeCheck(num));
    }
}
