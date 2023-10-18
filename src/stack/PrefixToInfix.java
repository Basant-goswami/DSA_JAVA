package stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String Prefix = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i=Prefix.length()-1; i>=0; i--){
            char ch = Prefix.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){
                String s = ""+ch;
                val.push(s);
            }
            else {
                String v1 = val.pop();
                String v2 = val.pop();
                String r = "(" + v1 + ch + v2 + ")";
                val.push(r);
            }
        }
        String ans = val.pop();
        System.out.println(ans);
    }
}
