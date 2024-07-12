package TCS_Prep;

import java.util.Scanner;

public class char_inpu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your char");
        char[] arr = new char[5];
        for (int i=0;i<5;i++){
            arr[i] = sc.next().charAt(0);
        }
        for (char el : arr){
            System.out.print(el+" ");
        }
    }
}
