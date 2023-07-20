package Assignment4;

public class Aggressive_Cows {
    public static void main(String[] args) {
         int k = 3;
         int[] stall = {1,3,5,9};
        System.out.println(Distance(stall,k));

    }
    static int Distance(int[] stall , int k ){
        int n = stall.length;
        int s = 0;
        int max = -1;
        for(int i = 0 ; i<n ;i++){
            max = Math.max(max,stall[i]);
        }
        int e = max;
        int ans = -1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(isPossible(stall , mid, k)){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    static boolean isPossible(int[] arr , int mid , int k){
        int cow = 1;
        int lastPos = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]-lastPos>=mid){
                cow++;
                if( cow == k){
                    return true;
                }
                lastPos = arr[i];

            }
        }
        return false;
    }


}
