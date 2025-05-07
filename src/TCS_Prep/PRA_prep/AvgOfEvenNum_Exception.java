package TCS_Prep.PRA_prep;

import java.util.Scanner;

public class AvgOfEvenNum_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                sum += arr[i];
                count++;
            }
        }
        try{
            if(count == 0){
                throw new NotFoundException("No even number found.");
            } else {
                double avg = sum / count ;
                System.out.println(avg);
            }
        } catch (NotFoundException e){
            System.out.println(e.getClass().getSimpleName()+": "+e.getMessage());
        }

    }
}

class NotFoundException extends Exception {
    public NotFoundException(String msg){
        super(msg);
    }
}
