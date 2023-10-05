package DP;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(Helper(arr,dp));

    }
    public static int Helper(int[] arr , int[] dp){
        int f = minCost(arr,0,dp);
        int s = minCost(arr, 1, dp);
        return Math.min(f,s);
    }
    public static int minCost(int[] arr , int i , int[] dp ){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int first = minCost(arr, i+1, dp);
        int second = minCost(arr, i+2, dp);
        return dp[i] = Math.min(first,second) + arr[i];
    }

    public static int minCostBU(int[] arr){
        int []dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for(int i = 2 ; i < arr.length; i++){
            dp[i] = arr[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[arr.length-2], dp[arr.length-1]);
    }
}
