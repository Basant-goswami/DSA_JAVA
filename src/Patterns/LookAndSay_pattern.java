package Patterns;


//Ip: n=5
//        Op:
//        1
//        1 1
//        2 1
//        1 2 1 1
//        1 1 1 2 2 1

public class LookAndSay_pattern {
    private static void solution(int n){
        String current = "1";
        System.out.println(current);
        for (int i=1;i<n;i++) {
            current = nextElement(current);
            System.out.println(current);
        }
    }
    private static String nextElement(String current){
        int count = 1;
        StringBuilder ans = new StringBuilder();
        char digit = current.charAt(0);

        for (int i=1;i<current.length();i++){
            if (current.charAt(i) == digit){
                count++;
            } else {
                ans.append(count).append(digit);
                digit = current.charAt(i);
                count = 1;
            }
        }
        ans.append(count).append(digit);
        return ans.toString();
    }
    public static void main(String[] args) {
        int n = 5;
        solution(n);
    }
}
