package Backtracking;

public class PrintRatInMaze_2dir {
    public static void PrintPath(int sr,int sc,int er,int ec,String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        PrintPath(sr,sc+1,er,ec,s+"R");     // going Right
        PrintPath(sr+1,sc,er,ec,s+"D");     // going down
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int sr=0,sc=0,er=rows-1,ec=cols-1;
        String s = "";
        PrintPath(sr,sc,er,ec,s);
    }
}
