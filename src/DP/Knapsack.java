package DP;

public class Knapsack {
    public static void main(String[] args) {
        int cap = 8;
        int wt[] = {1,4,2,3,6};
        int val[] = {1,1,7,9,1};
        int[][] dp = new int[cap+1][wt.length+1];
        System.out.println(knpsck(wt,val,cap,0,dp));

    }
    public static int knpsck(int wt[] , int val[] , int  cap , int i, int[][] dp){
        if(cap == 0 || i == wt.length){
            return 0;
        }

        if(dp[cap][i] != 0){
            return dp[cap][i];
        }
        int inc = 0;
        int exc = 0;

        if(cap >= wt[i]){
            inc = val[i] + knpsck(wt,val,cap-wt[i],i+1,dp);
        }
        exc = knpsck(wt,val,cap,i+1,dp);
        return dp[cap][i] =  Math.max(inc,exc);
    }
    static int knapSackBU(int wt[], int[] val , int cap ){
        int[][] dp = new int[wt.length+1][val.length+1];
        for(int  c = 1; c < dp.length; c++){
            for(int i = 1; i < dp[0].length ; i++){
                int inc = 0;
                int exc = 0;
                if(c >= wt[i-1]){
                    inc = val[i] + dp[c-wt[i-1]][i-1];
                }
                exc = dp[c][i-1];
                 dp[c][i] = Math.max(inc,exc);
            }
        }
        return dp[cap][wt.length];
    }

}
