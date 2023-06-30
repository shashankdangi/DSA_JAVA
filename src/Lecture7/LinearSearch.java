package Lecture7;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1,34,56,78,11,-7,90};
        int item = 0;
        System.out.println(search(arr,item));
    }
    static int search(int[] arr , int i){
        int j = 1;
        int count = 0;
        while(j<arr.length){
            if(arr[j] == i){
                count = j;
                break;
            }else{
                count = -1;
            }
            j++;
        }
        return count;
    }
}
