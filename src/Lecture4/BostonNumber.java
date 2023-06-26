package  Lecture4;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(sum(num) == prime(num)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
    public  static int prime(int num){
        int i = 1;
        int prime = 2;
        int sum = 0;
        while(num>0 && prime<=num){
            while(num%prime != 0){
                prime++;
            }
            if(num%prime == 0){
                sum += prime;
            }
            num /= prime;

        }
        return sum;
    }
    public static  int sum(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

}
