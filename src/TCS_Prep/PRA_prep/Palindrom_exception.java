package TCS_Prep.PRA_prep;

import java.util.Scanner;

public class Palindrom_exception {

    public static String stringPalindrom(String s ){
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String s1 = str.toString();
        return s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int x =  arr[i];
            String s = Integer.toString(x);
            try {
                String sp = stringPalindrom(s);
                if(s.equals(sp)){
                    throw new PalindromException("Number is a Plaindrom");
                } else {
                    System.out.println(sp);
                }
            } catch (PalindromException e){
                System.out.println(e.getClass().getSimpleName()+": "+e.getMessage());
            }
        }
    }
}

class PalindromException extends Exception{
    public PalindromException (String msg){
        super(msg);
    }
}