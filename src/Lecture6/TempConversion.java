package Lecture6;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min = scn.nextInt();
        int max = scn.nextInt();
        int step = scn.nextInt();
        conversion(min,max,step);

    }
    public static void conversion(int min , int max , int step){
        while(min<=max){
            int c = ((5*(min-32))/9);
            System.out.println(min+" "+c);
            min += step;
        }


    }
}
