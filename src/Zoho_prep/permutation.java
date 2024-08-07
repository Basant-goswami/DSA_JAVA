package Zoho_prep;

public class permutation {
    private static void printPermutation(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation( newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str,"");
    }
}
