package Lecture19;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,9,3,5};
        int[] ans = mergeSort(arr,0,arr.length-1);
        for(int num : ans){
            System.out.print(num+" ");
        }
    }
    static int[] mergeSort(int[] arr , int low , int high){
        if(low == high){
            int[] ans = new int[1];
            ans[0] = arr[low];
            return ans;
        }
        int mid = (low+high)/2;
        int[] right = mergeSort(arr,low,mid);
        int[] left = mergeSort(arr,mid+1,high);
        return merge(right,left);
    }
    static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n + m];
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                k++;
                i++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        //handle the cases when the lenght of first array is larger than second array and element's are left to be compared
        while (i < n) {
            ans[k] = a[i];
            i++;
            k++;
        }

        //handle the cases for the remaining items of second array
        while (j < m) {
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }

}
