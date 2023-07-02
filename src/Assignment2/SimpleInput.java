package Assignment2;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = scn.nextInt();
            sum += n;
            if(sum<0){
                break;
            }
            System.out.println(n);
        }

    }
}
