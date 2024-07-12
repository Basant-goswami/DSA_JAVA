package Zoho_prep;

// currency 2000, 500, 200, 100, 50,20, 10, 5, 1

import java.util.Scanner;

public class Currency_counter {
    private static void currencyCounter(int curr){
        int[] note = {2000, 500, 200, 100, 50,20, 10, 5, 1};
        int[] counter = new int[note.length];
        for (int i=0;i<note.length;i++){
            if(curr > note[i]){
                counter[i] = curr / note[i];
                curr = curr % note[i];
            }
        }
        // print notes
        for(int i=0;i<note.length;i++){
            if(counter[i]>0){
                System.out.println(note[i]+" : "+counter[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the currency :");
        int curr = sc.nextInt();
        currencyCounter(curr);
    }
}
