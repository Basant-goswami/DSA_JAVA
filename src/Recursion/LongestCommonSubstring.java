package Recursion;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static int LCS(String s1 , String s2,int n, int m, int max){
        if(n==0 || m == 0 ) return 0;

        if(s1.charAt(n) == s2.charAt(m)) {
            return LCS(s1, s2, n - 1, m - 1, max) + 1;
        } else {
            int a = LCS(s1,s2,n,m-1,max);
            int b = LCS(s1,s2,n-1,m,max);
            return Math.max(a,b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String s1 :");
        String s1 = sc.next();
        System.out.println("String s2 : ");
        String s2 = sc.next();
        int ans = LCS(s1,s2,s1.length()-1,s2.length()-1,0);
        System.out.println(ans);
    }
}
