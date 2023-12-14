import java.util.Scanner;

public class TransRowColumn {
    public static void main(String[] args) {
        String ans = "";
        System.out.println("Enter your plain text : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        // removing white space
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                ans += ch;
            }
        }
        System.out.println(ans);

        // adding char into the matrix
        int col = 4;
        int row = (str.length()/col)+1;
        char[][] arr = new char[row][col];
        int x = 0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(x<ans.length()){
                    arr[i][j] = ans.charAt(x);
                } else {
                    arr[i][j] = ' ';
                }
                x++;
            }
        }

        char[][] arr2 = new char[col][row];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("encrypted text is : ");
        String res = "";
        // printing the string
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                char ch = arr2[i][j];
                if(ch != ' '){
                    res += ch;
                }
//                res += ch;
            }
        }
        System.out.println(res);
    }
}
