package DP;

import java.util.Arrays;

public class Coin_ChangeII {
    public static void main(String[] args) {
        int[] coin = {1,2,5};
        int amount = 5;
        int[][] dp = new int[amount+1][coin.length+1];
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
//        System.out.println(CoinChanges(coin,amount,0));
        System.out.println(CoinChangesTD(coin, amount , 0 , dp));
    }

    //Plain Recursion
    public static int CoinChanges(int[] coin , int amount , int i ){
        if(amount == 0){
            return 1;
        }
        if(i == coin.length){
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if(amount >= coin[i]){
            inc += CoinChanges(coin,amount-coin[i], i);
        }
        exc += CoinChanges(coin,amount,i+1);
        return inc+exc;
    }

    //DP Top Down
    static int CoinChangesTD(int[] coin , int amount , int i , int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(i == coin.length){
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if(dp[amount][i] != -1){
            return dp[amount][i];
        }
        if(amount >= coin[i]){
            inc += CoinChangesTD(coin,amount-coin[i], i,dp);
        }
        exc += CoinChangesTD(coin,amount,i+1,dp);
        return dp[amount][i] =  inc+exc;
    }

    //DP Bottom UP
    static int CoinChangesBU(int[] coin , int amount ){
        int[][] dp = new int[amount+1][coin.length+1];
        for(int i = 0 ; i < dp[0].length; i++){
            dp[0][i] = 1;
        }
        for(int am = 1; am < dp.length ; am++ ){
            for(int i = 1; i < dp[0].length ; i++){
                int inc = 0;
                int exc = 0;
                if(am >= coin[i-1]){
                    inc += dp[am-coin[i-1]][i];
                }
                exc  += dp[am][i-1];
                dp[am][i] = exc + inc;
            }
        }
        return dp[amount][coin.length];


    }

}
