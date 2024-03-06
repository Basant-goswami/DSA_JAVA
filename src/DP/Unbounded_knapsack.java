package DP;

public class Unbounded_knapsack {

    // unbounded knapsack problem , that gives max wt or price to add items (repeat possible) into knapsack
    public static int unboundKnap(int[] val,int [] wt, int W,int n){
         int dp[][] = new int[n+1][W+1];
         for (int i=0;i<dp.length;i++){
             dp[i][0] = 0;
         }
         for (int i=0; i<dp[0].length;i++){
             dp[0][i] = 0;
         }
         for (int i=1;i<n+1;i++){
             for (int j=1;j<W+1;j++){
                 if(wt[i-1] <= j){      // if valid wt
                     dp[i][j] = Math.max((val[i-1] + dp[i][j-wt[i-1]]) , dp[i-1][j]);
                 } else {       // not valid wt
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         return dp[n][W];
    }

    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        System.out.println(unboundKnap(val,wt,W,val.length));
    }
}
