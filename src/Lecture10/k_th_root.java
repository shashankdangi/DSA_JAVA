package Lecture10;

public class k_th_root {
    public static void main(String[] args) {
        int i = 1;
        int k = 3;
        int n = 128;
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = (low + high)/2;
            if(Math.pow(mid,k)<=n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
