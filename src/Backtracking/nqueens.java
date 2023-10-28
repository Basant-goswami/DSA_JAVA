package Backtracking;

public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        AnsQueen(board,0);
    }

    private static void AnsQueen(char[][] board, int row) {
        int n=board.length;
        // base case
        if (row == n){
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j=0;j<n;j++){
            if (isSafe(board,row,j)){
                board[row][j] = 'Q';
                AnsQueen(board,row+1);
                board[row][j] = 'X'; // backtracking v-imp
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // for row
        for (int j=0;j<n;j++){
            if (board[row][j]=='Q') return false;
        }
        // for cols
        for (int i=0;i<n;i++){
            if (board[i][col]=='Q') return false;
        }
        // for NE direction
        int i=row;
        int j=col;
        while (i>=0 && j<n){
            if (board[i][j]=='Q') return false;
            i--;
            j++;
        }
        // for SE direction
        i=row;
        j=col;
        while (i<n && j<n){
            if (board[i][j]=='Q') return false;
            i++;
            j++;
        }
        // for NW direction
        i=row;
        j=col;
        while (i>=0 && j>=0){
            if (board[i][j]=='Q') return false;
            i--;
            j--;
        }
        // for SW direction
        i=row;
        j=col;
        while (i<n && j>=0){
            if (board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
}
