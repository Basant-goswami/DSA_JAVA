package Patterns;

public class Diamond_pattern {
    public static void main(String[] args) {
        int n=6;
        // first half
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i=n;i>0;i--){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
