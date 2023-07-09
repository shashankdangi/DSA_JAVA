package Assignment3;

public class RunningSumOfGivenArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] num = new int[arr.length];
        int n = arr.length;
        num[0] = 0;
        for(int i = 1 ; i<n; i++){
            num[i] = num[i-1]+arr[i-1];
        }

        for(int k = 0 ; k<n; k++){
            System.out.print(arr[k]+num[k]+" ");
        }

    }
}
