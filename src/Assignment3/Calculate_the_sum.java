package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_the_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int sum = 0 ;
        int n = arr.length;
       for(int j = 0 ; j<2; j++){
           int x = scn.nextInt();
           int[] temp = new int[n];
           for(int i = 0 ; i<n; i++){
               temp[i] = arr[i];
           }
           for(int i = 0 ; i<n; i++){
               if(i-x<0){
                   int y = n-x;
                   temp[i] = arr[i]+arr[y];
               }else{
                   temp[i] = arr[i]+arr[i-x];}

           }
           for(int i = 0 ; i<n; i++){
               arr[i] = temp[i];
           }

       }
       for(int num : arr){
           sum += num;
       }
        System.out.println(sum%1000000007);



    }
}
