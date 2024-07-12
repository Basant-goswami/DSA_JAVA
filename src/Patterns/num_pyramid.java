package Patterns;

public class num_pyramid {
    public static void main(String[] args) {
        int row = 4;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("****************");
        for (int i=0;i<row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
