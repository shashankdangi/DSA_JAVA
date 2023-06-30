package Lecture7;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = {1,34,56,781,11,-7,90};
        System.out.println(max(arr));
    }
    static  int max(int[] arr){
        int j = arr[0];
        int i = 0;
        while(i<=arr.length-1){
            if(j<arr[i]){
                j = arr[i];
            }
            i++;
        }
        return  j ;
    }
}
