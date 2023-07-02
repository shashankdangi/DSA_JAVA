package Assignment2;

import java.util.Scanner;

public class NthFibonnici {
    public static void main(String[] args) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;
        while(i<=n){
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(a);
    }
}
