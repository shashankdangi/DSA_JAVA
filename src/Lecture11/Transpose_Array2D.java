package Lecture11;

import java.util.Arrays;

public class Transpose_Array2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {11,12,13,14},
                {10,20,30,40},
                {120,90,110,89}
        };
        int row = arr.length;
        int column  = arr[0].length;
        for(int i = 0 ; i<row; i++){
            for(int j = i+1 ; j<column; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;

            }
        }
        for(int i = 0 ; i<row; i++){
            for(int j = 0 ; j<column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
