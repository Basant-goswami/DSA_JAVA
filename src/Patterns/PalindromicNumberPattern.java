package Patterns;

public class PalindromicNumberPattern {
    private static void printPattern(int n){
        for (int i=1;i<=n;i++){
            // spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //assending
            for (int k=i;k>=1;k--){
                System.out.print(k);
            }
            //desending
            for (int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
            }
        }
    public static void main(String[] args) {
        printPattern( 4);
    }
}
