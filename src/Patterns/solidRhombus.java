package Patterns;

public class solidRhombus {

    public static void main(String[] args) {
        int n = 8;
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
