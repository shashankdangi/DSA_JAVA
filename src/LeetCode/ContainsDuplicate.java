package LeetCode;

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] arr = {0};
        int n = arr[0];
        for(int num : arr){
            if(n == num && arr.length>1){
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
            }
        }

    }
}
