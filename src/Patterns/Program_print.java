package Patterns;

import java.util.Scanner;

public class Program_print {
    private static void printPattern(String s){
        int n = s.length();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i == j){
                    System.out.print(s.charAt(i-1));
                }
                else if ((i+j) == n+1) {
                    System.out.print(s.charAt(n-i));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPattern(s);
    }
}
