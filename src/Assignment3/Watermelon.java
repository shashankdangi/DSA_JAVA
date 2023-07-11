package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int n = (w/2)-1;
        int[] arr = new int[n];
        int value = 2;
        for(int i = 0 ; i<n; i++){
            arr[i] = value;
            value += 2;
        }
        int l = 0;
        int h = n-1;
        int count = 0;
        while(l<n){
            if(arr[l]+arr[h] == w){
                count++;
                break;
            }
            l++;
            h--;
        }
        if(count>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
