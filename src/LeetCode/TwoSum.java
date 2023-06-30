package LeetCode;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {3,2,4};
        int target = 6;
        search(arr,target);
    }
    static void search(int[] arr , int target){
        int j = 0;
        int[] output = new int[2] ;
        while(j<=arr.length){
            int k = j;
            while(k<arr.length){
                if(arr[j] + arr[k] == target){
                    output[0] = j;
                    output[1] = k;
                    break;
                }
                k++;
            }
           j++;
        }
        System.out.println(Arrays.toString(output));
    }
}
