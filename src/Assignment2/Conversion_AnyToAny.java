package Assignment2;

import java.util.Scanner;

public class Conversion_AnyToAny {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sb = scn.nextInt();
        int db = scn.nextInt();
        int num = scn.nextInt();
        int a = sb_to_dec(num,sb);
        int b = Dec_to_db(a,db);
        System.out.println(b);


    } public static int Dec_to_db(int num , int db){
        int mul = 1;
        int sum = 0;
        while(num>0){
            int rem = num%db;
            sum += rem * mul;
            mul *= 10;
            num /= db;
        }
        return sum;
    }
    public static int sb_to_dec(int num , int sb){
        int mul = 1;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit* mul;
            mul *= sb;
            num /= 10;
        }
        return  sum;
    }
}
