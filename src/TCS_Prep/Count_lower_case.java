package TCS_Prep;

import java.util.Scanner;

public class Count_lower_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int ans = 0;
        for(int i=0;i<inp.length();i++){
            char ch = inp.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ans ++;
            }
        }
        if(ans == 0){
            System.out.println("There is not any small charecter");
        } else{
            System.out.println(ans);
        }
    }
}
