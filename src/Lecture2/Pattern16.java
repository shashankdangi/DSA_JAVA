package Lecture2;

public class Pattern16 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = n;
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
            space--;
            star--;
        }
        i = 1;
        space = 1;
        star = 2;
        while(i<=n-1){
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
            space++;
            star++;
        }
    }
}
