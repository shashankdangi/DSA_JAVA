package Lecture4;

public class SumOfNumbers {
    public static void main(String[] args) {

        int n = 5837;
        int sum = 0;
        while(n>0){
            sum += (n%10);
            n = n/10;
        }
        System.out.println(sum);
    }
}
