package Patterns;

public class square {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
                if(j != n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
