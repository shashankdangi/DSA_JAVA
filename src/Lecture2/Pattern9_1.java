package Lecture2;

public class Pattern9_1 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i<=n){
            int k= 1;
            while(k<=n-i){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while(j<=i){
                System.out.print("x");
                j++;
            }
            int l = 1;
            while(l<(i)){
                System.out.print("x");
                l++;
            }
            System.out.println();
            i++;
        }
    }
}
