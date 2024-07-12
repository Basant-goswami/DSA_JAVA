package Patterns;

public class char_pyramid {
    public static void main(String[] args) {
        int row = 5;
        char ch = 65;
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
