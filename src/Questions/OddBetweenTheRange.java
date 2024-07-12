package Questions;

public class OddBetweenTheRange {
    private static void solution(int a ,int b){
        for (int i=a+1;i<b;i++){
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 15;
        solution(a,b);
    }
}
