package Assignment2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int product = n1*n2;
        while(n2%n1 != 0){
            int rem = n2%n1 ;
            n2 = n1;
            n1 = rem;
        }
        System.out.println((product)/n1);

    }
}
