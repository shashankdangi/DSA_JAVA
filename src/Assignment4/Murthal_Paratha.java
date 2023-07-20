package Assignment4;

public class Murthal_Paratha {
    public static void main(String[] args) {
        int Paratha = 10;
        int[] rank = {1,2,3,4};
        System.out.println(minTime(rank,Paratha));
    }
    static int minTime(int[] arr , int k ){
        int s = 0 ;
        int max = 0;
        for(int i = 1 ; i<=k ; i++){
            max += arr[arr.length-1]*i;
        }
        int e = max;
        int ans = -1;
        int mid = s + (e-s)/2;
        while(s<=e){
            System.out.println("s : "+ s + ", e: "+ e +", mid : "+ mid);
            if(isPossible(arr, mid , k)){
                ans = mid;
                e = mid -1;
            }else{
                s = mid + 1;
            }

            mid = s + (e-s)/2;
        }
        return ans;
    }
    static boolean isPossible(int[] arr , int mid , int k ){
        int time = 0;
        int chef = 0;
        int j = 1;
        for(int i = 0 ; i<k ; i++){
            if(time + arr[chef] * j <= mid){
                time += arr[chef] * j;
            }else{
                chef++;
                j = 1;
                if(chef>=arr.length){
                    return false;
                }
                time = 0;
                time += arr[chef]*j;
            }
            j++;
        }
        return true;
    }
}
