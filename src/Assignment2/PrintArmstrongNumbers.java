package Assignment2;

import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        while(num1<num2){
            check(num1);
            num1++;
        }
    }
    public static void check(int num) {
        int count = 0;
        int i = num;
        int k = num;
        while (num > 0) {
            count++;
            num /= 10;
        }
        int j = 1;
        int sum = 0;
        while (k > 0) {
            int digit = k % 10;
            sum += Math.pow(digit, count);


            k /= 10;
        }


        if (sum == i) {
            System.out.println(i);
        }


    }
}
