package Lecture4;

import java.util.Scanner;

//Binary Conversion
//dec to binary
public class Conversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num  = scn.nextInt();
        int mul = 1;
        int sum = 0;
        while(num>0){
            int rem = num%2;
            sum += rem * mul;
            mul *= 10;
            num /= 2;
        }
        System.out.println(sum);
    }
}
