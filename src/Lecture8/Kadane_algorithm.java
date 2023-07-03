package Lecture8;

public class Kadane_algorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,5,-1,2,1,-5,4};
        System.out.println(MaxSum(arr));
    }
    static int MaxSum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            ans = Math.max(sum,ans);
            if(sum<0){
                sum = 0;
            }

        }
        return ans;
    }
}
