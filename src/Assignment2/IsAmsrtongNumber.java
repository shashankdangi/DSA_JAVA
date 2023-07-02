package Assignment2;

import java.util.Scanner;

public class IsAmsrtongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int count = 0;
        int i = num;
        int k = num;
        while(num>0){
            count++;
            num /= 10;
        }
        int j = 1;
        int sum = 0;
        while(k>0){
            int digit = k%10;
            sum += Math.pow(digit,count);


            k /= 10;
        }


        if(sum == i){
            System.out.println("true");
        }else{
            System.out.println("false");

        }


    }
}
