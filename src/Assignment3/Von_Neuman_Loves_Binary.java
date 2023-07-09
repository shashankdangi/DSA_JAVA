package Assignment3;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0 ; i<n; i++){
            int num = scn.nextInt();
            toDecimal(num);
        }
    }
    static void toDecimal(int num){
        int sum = 0;
        int mul = 1;
        while(num>0){
            int digit = num%10;
            sum +=  digit*mul;
            mul *= 2;
            num /= 10;
        }
        System.out.println(sum);
    }

}
