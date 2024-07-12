package Zoho_prep;

public class subString {
    private static void printSubstring(String str, StringBuilder ans, int i){
        // base case
        if (i == str.length()){
            System.out.println(ans);
            return;
        }
        //include
        printSubstring(str, ans.append(str.charAt(i)), i+1);
        printSubstring(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        printSubstring(str,new StringBuilder(),0);
    }
}
