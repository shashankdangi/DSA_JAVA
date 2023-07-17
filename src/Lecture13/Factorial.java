package Lecture13;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    static int factorial(int num){
        int res = 1;
        if(num == 0 || num == 1){
            return res;
        }else{
            res = num * factorial(num-1);
        }
        return res;

    }
}
