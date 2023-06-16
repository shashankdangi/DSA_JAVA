package Lecture2;

import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of n : ");
        int n = scn.nextInt();
        int i =1;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print("x\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
