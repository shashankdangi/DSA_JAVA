package Lecture3;

import java.util.Scanner;

public class Pascals2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int i = 0;
       int n = scn.nextInt();
       while(i<n){
           int j = 0;
           int num = 1;
           while(j<=i){
               System.out.print(num+" ");
               num = num * (i-j)/(j+1);
               j++;
           }
           System.out.println();
           i++;
       }
    }
}
