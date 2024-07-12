package Patterns;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary no: ");
        int num = sc.nextInt();
        int pow = 0;
        int decimal = 0;
        while(num > 0){
            int digit = num % 10;
            decimal = decimal + digit * (int)Math.pow(2,pow);
            pow ++;
            num = num / 10;
        }
        System.out.println(decimal);
    }
}
