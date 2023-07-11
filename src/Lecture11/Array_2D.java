package Lecture11;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner scn = new Scanner(System.in);
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
