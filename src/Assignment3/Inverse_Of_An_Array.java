package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse_Of_An_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr);
    }
    static void reverse(int[] arr){
        int i = 0;
        int n = arr.length;
        int[] ans = new int[n];
        while(i<n){
            int temp = arr[i];
            ans[temp] = i;
            i++;
        }
        for(int j = 0; j<n; j++){
            System.out.print(ans[j]);
        }
    }
}
