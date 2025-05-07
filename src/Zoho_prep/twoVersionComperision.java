package Zoho_prep;

import java.util.Scanner;

public class twoVersionComperision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two String : ");
        String v1 = sc.next();
        String v2 = sc.next();

        String[] arr1 = v1.split("\\.");
        String[] arr2 = v2.split("\\.");

        for(int i=0;i< arr1.length || i< arr2.length;i++){
            int a = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int b = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if(a<b){
                System.out.println("Upgraded");
                return;
            } else if(a>b) {
                System.out.println("Deupgraded");
                return;
            }
        }
        System.out.println("Equal");

    }
}
