package DP;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
          int [] arr = {5,2,1,11};
          int[] dp = new int[arr.length];
        Arrays.fill(dp , -1);
        System.out.println(Robber(arr,0,dp));
        System.out.println(RobberBU(arr));
    }
    public static  int Robber(int [] arr , int i, int[] dp){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int rob = arr[i] + Robber(arr, i+2,dp);
        int not_rob = Robber(arr, i+1,dp);
        return dp[i] = Math.max(rob,not_rob);
    }

    //BottomUp
    public static int RobberBU(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i = 2 ; i < dp.length ; i++){
            dp[i] = Math.max(dp[i-1], arr[i]+dp[i-2]);
        }
        return dp[arr.length-1];
    }
}
