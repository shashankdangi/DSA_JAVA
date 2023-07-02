package Assignment2;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int j = 1;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += j * Math.pow(10,digit-1);

            num /= 10;
            j++;
        }
        System.out.println(sum);


    }
}
