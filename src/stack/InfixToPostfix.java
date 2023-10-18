package stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String Infix = "9-(5+3)*4/6";
        //creating two stack
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i=0; i<Infix.length(); i++){
            char ch = Infix.charAt(i);
            int ascii = (int)ch;  // checking it is num or oprator
            if (ascii>=48 && ascii<=58) {
                String  s = ""+ch;
                val.push(s);
            } else if (opr.size()==0 || ch=='(' || opr.peek()=='(') {
                opr.push(ch);
            } else if (ch==')') {
                while (opr.peek()!='('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char op = opr.pop();
                    String r = val1 + val2 + op;
                    val.push(r);
                }
                opr.pop();
            }
            else {
                if (ch=='+' || ch=='-'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char op = opr.pop();
                    String r = val1 + val2 + op;
                    val.push(r);
                    opr.push(ch);
                }
                if (ch=='*'|| ch=='/') {
                    if (opr.peek()=='*'|| opr.peek()=='/'){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char op = opr.pop();
                        String r =val1 + val2 +op;
                        val.push(r);
                        opr.push(ch);
                    } else {
                        opr.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String val2 = val.pop();
            String val1 = val.pop();
            char op = opr.pop();
            String r = val1 + val2 + op;
            val.push(r);
        }
        String FinalResult = val.pop();
        System.out.println(FinalResult);
    }
}
