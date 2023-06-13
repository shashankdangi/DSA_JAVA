package Lecture1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
//        UserInput
        Scanner scn = new Scanner(System.in);
//        Assigning Input to Integer Variable
        int x = scn.nextInt();
//        Condition to check if it's odd or even
        if(x%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
