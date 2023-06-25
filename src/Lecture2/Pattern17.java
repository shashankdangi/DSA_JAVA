package Lecture2;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 1;
        int n = scn.nextInt();
        int star = n/2;
        int space = n%2;
        while(i<=n/2){
            int j = 1;
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            int k = 1;
            while(k<=space){
                System.out.print("   ");
                k++;
            }
            int l = 1;
            while(l<=star){
                System.out.print("*  ");
                l++;
            }
            System.out.println();
            i++;
            star--;
            space += 2;
        }
        if(n%2 != 0){
            System.out.println();
        }
        i = 1;
        star = 1;
        space = n-2;
        while(i<=n/2)
        {
            int j = 1;
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            int k = 1;
            while(k<=space){
                System.out.print("   ");
                k++;
            }
            int l = 1;
            while(l<=star){
                System.out.print("*  ");
                l++;
            }
            System.out.println();
            i++;
            star++;
            space -= 2;
        }
    }
}
