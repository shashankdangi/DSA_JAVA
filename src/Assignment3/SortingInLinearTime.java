package Assignment3;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortColors(int[] arr) {
        // Write your code here
        int mid = 0 ;
        int low = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;

            }
        }



    }
}
