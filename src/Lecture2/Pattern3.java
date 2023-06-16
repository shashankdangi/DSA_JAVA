package Lecture2;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 1;
        int n = scn.nextInt();
        while(i<=n){
            int k = i;
            while(k<=(n)){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
