package Backtracking;

public class RatInMaze_4_Direction {
    // rat can travel (left, right , up, down) to reach destination point
    static int count=0;
    public static void PrintRatInMaze_4_direction(int sr,int sc,int er,int ec, String s, boolean[][] isVisited){
        if(sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if(isVisited[sr][sc] == true){
            return;
        }
        if (sr==er && sc==ec){
            System.out.println(s);
            count ++;
            return;
        }
        isVisited[sr][sc] = true;
        // go right;
        PrintRatInMaze_4_direction(sr,sc+1,er,ec,s+"R",isVisited);
        // go down
        PrintRatInMaze_4_direction(sr+1,sc,er,ec,s+"D",isVisited);
        // go left
        PrintRatInMaze_4_direction(sr,sc-1,er,ec,s+"L",isVisited);
        // go up
        PrintRatInMaze_4_direction(sr-1,sc,er,ec,s+"U",isVisited);

        // Backtracking to print all possible paths
        isVisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        String s = "";
        boolean[][] isVisited = new boolean[rows][cols];      // by default "false"
        int sr=0,sc=0,er=rows-1,ec=cols-1;
        PrintRatInMaze_4_direction(sr,sc,er,ec,s,isVisited);
        System.out.println("Total no of ways :"+count);
    }
}
