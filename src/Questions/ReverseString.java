package Questions;

public class ReverseString {
    private static String  solution(String s){
        StringBuilder ans = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }
        }
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch)){
                ans.insert(i,ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String inp = "house no : 123@ cbe";
        String res = solution(inp);
        System.out.println(res);
    }
}