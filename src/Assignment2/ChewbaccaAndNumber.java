package Assignment2;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long i = 1;
        long num = scn.nextLong();
        boolean flag = false;
        long mul = 1;
        long sum = 0;
        while(num>0){
            long digit = num%10;
            if(num/10 == 0 && digit == 9){
                digit = 9;
                flag = true;
            }
            if(digit >=5 && digit <= 9 && !flag){
                digit = 9 - digit;
            }
            sum += digit*mul;
            mul *= 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
