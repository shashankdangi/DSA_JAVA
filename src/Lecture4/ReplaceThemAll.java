package Lecture4;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int mul = 1;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            if(rem == 0){
                rem = 5;
            }
            sum += rem * mul;
            mul *= 10;
            num /=10;

        }
        System.out.println(sum);



    }
}
