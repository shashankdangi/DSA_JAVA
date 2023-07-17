package Assignment3;

import java.util.Scanner;

public class Arrays_LinearSearch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextLong();
        }
        long m = scn.nextLong();
        int out = 0;
        int l = 0;
        for (; l < n; l++) {
            if (arr[l] == m) {
                out += 1;
                break;
            }
        }
        if(out>0){
            System.out.println(l);
        }else{
            System.out.println("-1");
        }

    }
}
