package Lecture8;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr= {9,5,3,8,4,5};
        Sort(arr);


    }
//    static void Sort(int[] arr){
//        int i = 1;
//        while(i<arr.length){
//            int j = 0;
//            while(j<arr.length-1){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//               j++;
//            }
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    static void Sort(int[] arr){
        int i = 1;
        for(; i<arr.length;i++){
            for(int j =  0 ; j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
