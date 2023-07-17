package Lecture13;

public class First_Occ {
    public static void main(String[] args) {
        int[] arr = {1,6,2,3,57,8};
        int item = 8;
        int i = 0;
        System.out.println(firstOcc(arr,item,i));
    }
    static int firstOcc(int[] arr , int item , int i ){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == item ){
            return 1;
        }
        return firstOcc(arr,item,i+1);

    }
}
