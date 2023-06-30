package Lecture7;

// Array Swapping
public class Array {
    public static void main(String[] args) {
       int[] arr = {1 ,34 ,56,78,90};
       swap(arr, 0 , 1);
        System.out.println(arr[0]+" "+arr[1]);

    }
    static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
