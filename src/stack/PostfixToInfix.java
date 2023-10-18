package stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String Postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i=0; i<Postfix.length(); i++){
            char ch = Postfix.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){
                String s =""+ch;
                val.push(s);
            }
            else {
                String v2 = val.pop();
                String v1 = val.pop();
                String r = "("+v1+ch+v2+")";
                val.push(r);
            }
        }
        String ans = val.pop();
        System.out.println(ans);
    }
}
