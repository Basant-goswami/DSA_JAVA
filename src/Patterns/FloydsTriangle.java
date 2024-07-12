package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        int row = 5;
        int count = 1;
//        for (int i=1;i<=row;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(count++ +" ");
//            }
//            System.out.println();
//        }

        // triangle 0 and 1
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else if((i+j) % 2 == 1) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
