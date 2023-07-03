package LeetCode;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr= {5,4,-1,7,8};
        System.out.println(MaxSum(arr));

    }
    static int MaxSum(int[] arr){
        int ans = Integer.MIN_VALUE; // Min Value of Integer -2^31

        for(int i = 0 ; i <arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum>ans){
                    ans = sum;
                }
            }
        }

        return ans;
    }
}
