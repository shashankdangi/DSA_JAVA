package Lecture2;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of n : ");

        int i = 1;
        int n = scn.nextInt();
        while(i<=n){
            int k = 1;
            while(k<=(n-i)){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while(j<=i){
                System.out.print("x");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
