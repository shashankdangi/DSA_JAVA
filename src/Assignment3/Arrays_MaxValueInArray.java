package Assignment3;

import java.util.Scanner;

public class Arrays_MaxValueInArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        long max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n; i++){
            arr[i] = scn.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
