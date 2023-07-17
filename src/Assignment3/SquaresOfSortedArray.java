package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = scn.nextInt();

        }
        for(int i = 0 ; i <n; i++){
            arr[i] *= arr[i];
        }
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}
