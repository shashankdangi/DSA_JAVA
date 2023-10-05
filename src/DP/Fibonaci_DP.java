package DP;

public class Fibonaci_DP {
    public static void main(String[] args) {
        int n = 45;
//        System.out.println(fibo(n));
        int[] dp = new int[n+1];
//        System.out.println(fiboTD(n,dp));
        System.out.println(fiboBU(n));
    }

    //using plain recusrsion it will cause stackoverflow or take too much time
    public static int fibo(int n){
    if(n == 0 || n == 1){
        return n;
    }
    int fn1 = fibo(n-1);
    int fn2 = fibo(n-2);
    return fn1+fn2;
    }


    //Top Down Approach
    static int fiboTD(int n , int dp[] ){
        if(n == 0 || n == 1){
            return n;
        }
        //apply dp
        if(dp[n] != 0){
            return dp[n];
        }


        int fn1 = fiboTD(n-1, dp);
        int fn2 = fiboTD(n-2, dp);

        //remember the value in dp
        dp[n] = fn1+fn2;
        return fn1+fn2;
    }

    //Bottom Up Approach

    static int fiboBU(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i < dp.length; i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
