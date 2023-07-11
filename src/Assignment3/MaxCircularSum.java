package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCircularSum {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int loop = scn.nextInt();
        while(loop>0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i<n; i++){
                arr[i] = scn.nextInt();
            }
            int result = Integer.MIN_VALUE;
            for(int i = 0 ; i<n; i++){
                int j = i;
                int sum = 0;
                for(int k = 0 ; k<n; k++){
                    if(j>=n){
                        j -= n;
                    }
                    sum += arr[j];
                    if(sum<0){
                        sum = 0;
                    }
                    j++;
                }
                result = Math.max(result,sum);



            }
            System.out.println(result);


            loop--;
        }

    }
}
