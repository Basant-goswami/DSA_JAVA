package Zoho_prep;

public class nQueens_problem {
    // printing arrays
    private static void printQueens(char[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
    //cheaking the places, is valid or not
    private static boolean isSafe(char[][] arr, int row, int col){
        // upper
        for (int i=row; i>=0; i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        // left diagonal
        for (int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        // right diagonal
        for (int i=row, j=col; i>=0 && j<arr.length; i--, j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    private static void nQueen(char[][] arr, int row){
        // base case
        if(row == arr.length){
            printQueens(arr);
            return ;
        }
        for(int j=0;j<arr.length;j++){
            if(isSafe(arr,row,j)){
                arr[row][j] = 'Q';
//                if(nQueen(arr,row+1)){
//                    return true;    // function call, only one sol print karane ke liye
//                }
                nQueen(arr,row+1);
                arr[row][j] = '*'; // backtracking
            }
        }
//        return false;
    }
    public static void main(String[] args) {
        int n = 5;
        char[][] arr = new char[n][n];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = '*';
            }
        }
        nQueen(arr,0);
    }
}
