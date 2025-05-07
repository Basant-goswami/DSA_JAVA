package TCS_Prep.PRA_prep;

import java.util.Scanner;

public class Palindrom_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length()-1;
        int f = 0;
        while (f<l){
            if(s.charAt(f) != s.charAt(l)){
                System.out.println("Not palindrome");
                return;
            } else {
                f++;
                l--;
            }
        }
        System.out.println("Palindrome");

    }
}
