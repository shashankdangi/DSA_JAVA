package DP;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lis(arr));
    }

    //using BottomUp DP
    public static int lis(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i = 1; i < dp.length; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int ans = 1;
        for(int x : dp){
            ans  = Math.max(x , ans);
        }
        return ans;
    }


    //Using Binary Search (Optimal Solution)
}
