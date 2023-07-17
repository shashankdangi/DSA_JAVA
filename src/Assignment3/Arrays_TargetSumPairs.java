package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_TargetSumPairs {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        Arrays.sort(arr);
        for(int i = 0 ; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(arr[i]+" and "+arr[j]);
                }
            }
        }


    }
}
