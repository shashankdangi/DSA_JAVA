package Lecture1;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if(marks >= 75){
            System.out.println("A");
        }else if(marks >= 65 && marks < 75){
            System.out.println("B");
        } else if (marks >= 55 && marks < 65) {
            System.out.println("C");
        } else if (marks >= 45 && marks < 55) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
