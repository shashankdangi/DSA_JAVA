package Lecture2;

public class Pattern14 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = 1;
        int space = n-1;
        while(i<=n){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
            star++;
            space--;
        }
        i = 1;
        star = n-1;
        space = 1;
        while(i<n){
            int l = 1;
            while(l<=space){
                System.out.print("  ");
                l++;
            }
            int m = 1;
            while(m<=star){
                System.out.print("* ");
                m++;
            }

            System.out.println();
            star--;
            space++;
            i++;
        }
    }
}
