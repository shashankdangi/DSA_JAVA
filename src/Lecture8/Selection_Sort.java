package Lecture8;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        Sort(arr);

    }
    static void Sort(int[] arr){

        for(int i = 0; i<arr.length;i++){
            for(int j = i + 1; j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
