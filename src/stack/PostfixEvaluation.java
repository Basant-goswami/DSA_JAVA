package stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String Postfix = "953+4*6/-";
        Stack<Integer> val = new Stack<>();

        for (int i=0;i<Postfix.length();i++){
            char ch = Postfix.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57) {
                val.push(ascii-48);
            }
            else {
                int v2 = val.pop();
                int v1 = val.pop();
                if (ch=='+') val.push(v1+v2);
                if (ch=='-') val.push(v1-v2);
                if (ch=='*') val.push(v1*v2);
                if (ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
