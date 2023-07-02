package Assignment2;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 2;
        int count = 0;
        while(i<n){
            if(n%i == 0){
                count ++;
                break;
            }
            i++;
        }
        if(count>=1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
