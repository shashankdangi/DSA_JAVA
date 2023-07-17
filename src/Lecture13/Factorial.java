package Lecture13;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int ans = 1;
        System.out.println(factorial(num));
        System.out.println(factorial1(num,ans));
    }
    //head Recursion
    static int factorial(int num){
        int res = 1;
        if(num == 0 || num == 1){
            return res;
        }else{
            res = num * factorial(num-1);
        }
        return res;

    }

    //tail Recursion
    static int factorial1(int num , int ans){
        if( num == 1){
            return ans;
        }
        return factorial1(num-1, ans*num);

    }
}
