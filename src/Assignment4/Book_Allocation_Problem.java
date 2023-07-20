package Assignment4;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        int std = 2;
        int[] pages = {10,20,30,40};
        System.out.println(Book(pages,std));
    }
    static int Book(int[] arr, int std){
        int s = arr[0];
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            sum += arr[i];
        }
        int e = sum;
        int ans = -1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(isPossible(arr,mid,std)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    static boolean isPossible(int[]arr , int mid , int m){
        int n = arr.length;
        int sum = 0;
        int std = 1;
        for(int i = 0; i<n; i++){
            if(sum + arr[i] <= mid){
                sum +=  arr[i];
            }else{
                std++;
                if(std > m || arr[i] > mid){
                    return false;
                }
                sum = 0;
                sum += arr[i];
            }
        }
        return true;
    }
}
