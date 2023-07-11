package Assignment3;

public class MaxSumPathInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,3,7,10,12,15,30,34};
        int[] arr2 = {1,5,7,8,10,15,16,19};
        int mini = 0 ;
        int minj = 0;
        int maxi = arr1.length;
        int maxj = arr2.length;
        int result = 0;
        int sum1 = 0;
        int sum2 = 0;
        int n = Math.max(maxi,maxj);

        for(int i = 0 ; i<n; i++){

            sum1 += arr1[i];
            sum2 += arr2[i];
            if(arr2[i] == arr1[i]){
                result = Math.max(sum1,sum2);
                sum1 = 0;
                sum2 = 0;
            }

        }
        System.out.println(result);
    }
}
