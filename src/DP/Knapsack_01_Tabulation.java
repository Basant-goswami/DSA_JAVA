package DP;

public class Knapsack_01_Tabulation {
    public static int knapsack(int[] val,int[] wt,int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for (int i=0;i<n;i++){       //  0th column fill with 0
            dp[i][0] = 0;
        }
        for(int j=0;j<dp[0].length;j++){     //  0th row fill with 0
            dp[0][j] = 0;
        }

        for (int i=1;i<n+1;i++){
            for (int j=1;j<W+1;j++){
                int v = val[i-1];    //  value of i-1th item
                int w = wt[i-1];       // wt of i-1th item
                // include
                if(w <= j){
                    // include
                    int ans1 = v + dp[i-1][j-w];
                    // exclude
                    int ans2 = dp[i-1][j];

                    dp[i][j] = Math.max(ans1,ans2);
                }
                else {
                    // exclude
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt =  {2 ,5 ,1, 3, 4};
        int W = 7;
        System.out.println(knapsack(val,wt,W));
    }
}
