package Lecture2;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int i = 1;
        int n = scn.nextInt();
        while(i<=n){
            int j =1 ;
            while(j<=n+1-i){
                System.out.print("x\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
