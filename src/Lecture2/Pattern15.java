package Lecture2;

public class Pattern15 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = n ;
        int space = 0;
        while (i<=n){
            int k = 1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }

            int j = 1;
            while(j<=n+1-i){
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;
            star--;
            space +=2;
        }
        i = 1;
        star = 2;
        space = n+1;
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
            star++;
            space -= 2;
        }
    }
}
