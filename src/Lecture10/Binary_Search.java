package Lecture10;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int item = 13;
        System.out.println(Search(arr,item));

    }
    static int Search(int[] arr, int item){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid] == item){
                return mid;
            }else if(arr[mid]>item){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
