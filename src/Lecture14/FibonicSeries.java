package Lecture14;

public class FibonicSeries {
    public static void main(String[] args) {
        int n =  6;
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1+f2;
    }
}
