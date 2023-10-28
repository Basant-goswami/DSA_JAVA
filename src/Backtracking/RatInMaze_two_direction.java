package Backtracking;

import java.util.Scanner;

public class RatInMaze_two_direction {
    // this ques, only two direction is possible --> right, down
    public static int print(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc == ec) return 1;
        //recursion
        int rightWays = print(sr,sc+1,er,ec);  // going right side
        int downWays = print(sr+1,sc,er,ec);    // going down side
        int totalWays = rightWays + downWays;
        return totalWays;
    }

    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the no of rows: ");
        int row = sca.nextInt();
        System.out.println("enter the no of column: ");
        int col = sca.nextInt();
        int sr =1, sc=1, er=row, ec=col;
        int count = print(sr,sc,er,ec);
        System.out.println("No of ways :"+count);
    }
}
