package LeetCode;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int profit = 0;
        int i = 0;
        while(i<arr.length){
            int k = i+1;
            while(k<arr.length){
                int n = arr[k]-arr[i];
                if(profit<n){
                    profit = n;
                }

                k++;

            }

            i++;
        }
        System.out.println(4%120);
    }
}
