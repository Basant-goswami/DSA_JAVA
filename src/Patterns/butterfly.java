package Patterns;

public class butterfly {
    public static void main(String[] args) {
        int n = 7;
        // first half
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            for (int j=0;j<(2*(n-i));j++){
                System.out.print("  ");
            }
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // second half
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            for (int j=0; j<(2*(n-i)); j++){
                System.out.print("  ");
            }
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
