package Assignment2;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = scn.nextInt();
        int count  = 0;
        while(num>0){
            int rem = num%10;
            if(rem == n){
                count ++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
