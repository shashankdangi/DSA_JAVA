package Assignment2;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = scn.nextInt();
        int count = 0;
        int j = 1;
        while(count<n){
            int num = 3*j + 2;
            if(num%i != 0){
                System.out.println(num);
                count++;
            }
            j++;
        }
    }
}
