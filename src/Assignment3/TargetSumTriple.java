package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriple {
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
            int k = target - arr[i];
            int l = i+1;
            int h = n-1;
            while(l<h){
                if(arr[l]+arr[h]>k){
                    h--;
                }else if(arr[l]+arr[h]<k){
                    l++;
                }else{
                    System.out.println(arr[i]+", "+arr[l]+" and "+arr[h]);
                    l++;
                    h--;
                }
            }
        }
    }
}
