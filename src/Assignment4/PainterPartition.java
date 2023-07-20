package Assignment4;

import java.util.Arrays;

public class PainterPartition {
    public static void main(String[] args) {
        int painter = 2;
        int[] board = {5, 5, 5, 5};
        System.out.println(minTime(board, painter));

    }

    static int minTime(int[] arr, int k) {
        int s = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
        }
        int ans = -1;
        int e = max;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (isPossible(arr, mid, k)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }
    static boolean isPossible(int[] arr , int mid , int k ){
        int painter = 1;
        int time = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]+time <= mid){
                time += arr[i];
            }else{
                painter++;
                if(painter>k || arr[i]>mid){
                    return false;
                }
                time = 0;
                time += arr[i];
            }

        }
        return true;
    }
}
