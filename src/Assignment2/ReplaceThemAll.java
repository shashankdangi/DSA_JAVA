package Assignment2;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        if(num == 0){
            System.out.println("5");
        }else{
            long mul = 1;
            long sum = 0;
            long i  = 0;
            while (num > 0) {

                long rem = num % 10;
                if (rem == 0 ) {
                    rem = 5;
                }
                sum += rem * mul;
                mul = mul * 10;
                num /= 10;
                i++;
            }
            System.out.println(sum);
    }}
}
