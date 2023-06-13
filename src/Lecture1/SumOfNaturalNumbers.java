package Lecture1;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 7;
        int i = 1;
        int sum = 0;
        while( i<= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of  " + n +" Natural Number is : " + sum);
    }
}
