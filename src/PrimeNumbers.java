import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        System.out.println("prime number between 1 to 100");

        int n = 100;
//        int count=0;          //
        int chk;               // cheking the value is disible or not
        for (int i=2; i<n; i++){
            chk = 0;
            for (int j=2;j<i; j++){     // cheking 2 to i value whether it is divided or not
                if (i%j==0){
                    chk++;
                    break;
                }
            }
            if (chk==0){
                System.out.print(i+" ");
//                count++;
            }
        }
    }
}
