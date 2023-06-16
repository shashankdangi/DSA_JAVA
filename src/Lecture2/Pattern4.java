package Lecture2;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 1;
        int n = scn.nextInt();
        while(i<=n){
            int k = 1;
            while(k<i){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while(j<=n+1-i){
                System.out.print("x");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
