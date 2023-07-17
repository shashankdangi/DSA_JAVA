package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>0){
            int num = scn.nextInt();
            int[] arr = new int[num];
            for(int i = 0 ; i<num; i++){
                arr[i] = scn.nextInt();
            }
            int money = scn.nextInt();
            Arrays.sort(arr);
            pair(arr,money);

            n--;
        }

    }
    static void pair(int[] arr,int money){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int minI = 0;
        int minJ = 0;
        int minDiff = Integer.MAX_VALUE;
        while(low<high){
            int sum = arr[low]+arr[high];
            if(sum>money){
                high--;
            }else if(sum<money){
                low++;
            }else{
                int diff = arr[high]-arr[low];
                if(diff<minDiff){
                    minDiff = diff;
                    minI = arr[low];
                    minJ = arr[high];

                }
                high--;
                low++;
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+minI+" and "+minJ+".");
    }
}
