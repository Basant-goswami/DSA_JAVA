package Patterns;

public class NumberPyramid {
    private static void numPattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i);
                if (j != i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 8;
        numPattern(row);
    }
}
