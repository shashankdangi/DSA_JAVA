package Lecture2;

public class Pattern13 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
        int k = 1;
        while(k<=n-1){
            int l = 1;
            while(l<=n-k){
                System.out.print("*\t");
                l++;
            }
            System.out.println();
            k++;

        }
    }
}
