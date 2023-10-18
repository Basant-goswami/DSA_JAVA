package stack;

import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String str = "9-(5*5-2*2/2)/3";
        Stack<Integer> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if( ascii>=48 && ascii<=58) val.push(ascii-48);
            else if (opr.size()==0 || ch=='(' || opr.peek()=='(' ) opr.push(ch);
            else if (ch==')') {
                while (opr.peek()!='('){
                    //work
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (opr.peek() =='+') val.push(val1 + val2);
                    if (opr.peek() =='-') val.push(val1 - val2);
                    if (opr.peek() =='*') val.push(val1 * val2);
                    if (opr.peek() =='/') val.push(val1 / val2);
                    opr.pop();
                }
                opr.pop();
            } else {
                if (ch =='+' || ch == '-'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (opr.peek() =='+') val.push(val1 + val2);
                    if (opr.peek() =='-') val.push(val1 - val2);
                    if (opr.peek() =='*') val.push(val1 * val2);
                    if (opr.peek() =='/') val.push(val1 / val2);
                    opr.pop();
                    //push
                    opr.push(ch);
                }
                if (ch =='*' || ch =='/') {
                    if (opr.peek() == '*' || opr.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (opr.peek() == '*') val.push(val1 * val2);
                        if (opr.peek() == '/') val.push(val1 / val2);
                        opr.pop();
                        //push
                        opr.push(ch);
                    }
                else opr.push(ch);
                }
            }
        }

        while (val.size()>1){
            int val2 = val.pop();
            int val1 = val.pop();
            if(opr.peek()=='+') val.push(val1 + val2);
            if(opr.peek()=='-') val.push(val1 - val2);
            if(opr.peek()=='*') val.push(val1 * val2);
            if(opr.peek()=='/') val.push(val1 / val2);
            opr.pop();
        }
        System.out.println(val.peek());
    }
}
