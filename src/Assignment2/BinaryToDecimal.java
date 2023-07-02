package Assignment2;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*Math.pow(2,i);
            n /= 10;
            i++;
        }
        System.out.println(sum);

    }
}
