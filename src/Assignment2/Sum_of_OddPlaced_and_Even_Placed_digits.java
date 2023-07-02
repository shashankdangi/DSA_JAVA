package Assignment2;

import java.util.Scanner;

public class Sum_of_OddPlaced_and_Even_Placed_digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int odd = 0;
        int even = 0;
        int i = 1;
        while(n>0){
            if(i%2 == 0){
                even += n%10;
            }else{
                odd += n%10;
            }
            n /= 10;
            i++;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
