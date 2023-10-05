package DP;

public class Distinct_Subsequence {
    public static void main(String[] args) {

    }
    //Coin -> s, j
    //amount -> t, i;
    public static int Distinct(String s , String t , int i ,int j, int[][] dp){
        if( i == t.length()){
            return 1;
        }
        if(j == s.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int inc = 0;
        int exc = 0;
        if(s.charAt(j) == t.charAt(i)){
            inc = Distinct(s,t,i+1,j+1,dp);
        }
        exc = Distinct(s,t,i,j+1,dp);
        return dp[i][j] = inc+exc;
    }
}
