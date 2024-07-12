package Patterns;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num : ");
        int num = sc.nextInt();
        int binary = 0;
        int pow = 0;
        while(num > 0){
            int digit = num % 2;
            num = num / 2 ;
            binary = binary + digit *(int) Math.pow(10, pow);
            pow++;
        }
        System.out.println(binary);
    }
}
