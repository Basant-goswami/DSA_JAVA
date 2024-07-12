package Patterns;

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        int row = 5;
        for (int i=0;i<row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
