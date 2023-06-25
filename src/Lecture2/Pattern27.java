package Lecture2;

public class Pattern27 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int space = n-1;
        while (i<=n){
            int j = 1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k<=i){
                System.out.print(k);
                k++;
            }
            int l = i-1;
            while(l>=1){
                System.out.print(l);
                l--;
            }
            System.out.println();
            i++;
            space--;
        }
    }
}
