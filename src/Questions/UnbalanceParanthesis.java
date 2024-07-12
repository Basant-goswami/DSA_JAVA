package Questions;

import java.util.HashSet;
import java.util.Stack;

public class UnbalanceParanthesis {
    private static String solution(String s){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '('){
                st.push(i);
            } else if (ch == ')'){
                if (!st.isEmpty()){
                    st.pop();
                } else {
                    hs.add(i);
                }
            }
        }
        while (!st.isEmpty()){
            hs.add(st.pop());
        }
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (!hs.contains(i)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String inp = "((abc)((de))";
        String result = solution(inp);
        System.out.println(result);
    }
}
