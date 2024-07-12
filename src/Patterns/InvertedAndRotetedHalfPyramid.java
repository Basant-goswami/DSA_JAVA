package Patterns;

public class InvertedAndRotetedHalfPyramid {
    public static void main(String[] args) {
        int row = 8;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(j <= row -i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
