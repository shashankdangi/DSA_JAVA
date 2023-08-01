package Lecture19;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 9};
        int[] b = {0, 2, 4, 6, 9};
        merge(a, b);
    }

    static void merge(int[] a, int[] b) {
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

        for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
