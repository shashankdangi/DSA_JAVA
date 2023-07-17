package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyQuestions {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[3];
        int count = 0;
        while(n>0){
            arr[0] = scn.nextInt();
            arr[1] = scn.nextInt();
            arr[2] = scn.nextInt();
            Arrays.sort(arr);
            if(arr[1] == 1){
                count++;
            }
            n--;
        }
        System.out.println(count);

    }
}
