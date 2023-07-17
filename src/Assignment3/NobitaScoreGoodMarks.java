package Assignment3;

import java.util.Scanner;

public class NobitaScoreGoodMarks {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while(num>0){
            int x = scn.nextInt();
            int n = scn.nextInt();
            int c = x%n;
            System.out.println(Math.min(c,n-c));
            num--;
        }

    }
}
