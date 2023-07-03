package Lecture8;
import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2};
        int n = arr.length;
        Insert_in_Sort(arr, arr[n-1],n-2);
    }
    static void Insert_in_Sort(int[] arr , int item , int  i){
        while(i>=0 && arr[i]>item ){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = item;
        System.out.println(Arrays.toString(arr));
    }
}
