public class PalindromString {

    public static boolean palindrome(String str){
        int n = str.length();
        String reverse = "";
        for (int i=n-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "asdfdsa";
        System.out.println(palindrome(str));
    }
}
