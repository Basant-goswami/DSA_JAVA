package Zoho_prep;

public class Binary_strings_printing {
    private static void PrintString(int n, int lastIdx, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // work
        PrintString(n-1, 0, str+"0");
        if (lastIdx == 0) {
            PrintString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        PrintString(n, 0, "");
    }
}
