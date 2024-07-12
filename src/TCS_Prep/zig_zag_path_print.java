package TCS_Prep;

import org.postgresql.util.OSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class zig_zag_path_print {
    private static void PrintPattern(String str, int row ){

        char[][] pattern = new char[row][str.length()];
        for(char[] rows : pattern){
            Arrays.fill(rows,' ');
        }
        boolean down = true;
        int col = 0;
        int currRow = 0;
        str = str.replaceAll(" " , "");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            pattern[currRow][col] = ch;
            col++;
            if(down) currRow++;
            else currRow--;

            if (currRow == row-1){
                down = false;
            } else if (currRow == 0) {
                down = true;
            }
        }

        // print pattern
        for(char[] arr : pattern){
            System.out.println(arr);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter row no : ");
        int n = sc.nextInt();
        PrintPattern(str,n);
    }
}
