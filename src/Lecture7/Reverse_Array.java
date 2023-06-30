package Lecture7;
import java.util.*;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,11,7,89,80,-90,11};
        swap(arr,2,6);

    }
    static void swap(int[] arr, int i , int j){
        while(i<j){
            int temp = arr[i] ;
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
