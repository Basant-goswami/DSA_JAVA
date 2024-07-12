package Questions;

import java.util.Scanner;

public class NumberInWords {
    private static String Solution(int num){
        if (num == 0){
            return "zero";
        }
        String[] unit = {"","One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        StringBuilder ans = new StringBuilder();

        if (num > 100){
            int digit = num / 100;
            ans.append(unit[digit]).append(" Hundred ");
            num = num % 100;
            if (num > 20){
                ans.append("and ");
            }
        }
        if (num >= 20){
            int digit = num / 10;
            ans.append(tens[digit]);
            num = num % 10;
            if (num > 0){
                ans.append(" ");
            }
        }
        else if (num >= 10){
            ans.append(teens[num % 10]);
            num = 0;
        }
        if (num < 10){
            ans.append(unit[num]);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(Solution(num));
    }
}
