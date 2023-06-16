package Lecture2;

public class Pattern23 {
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
                System.out.print("1 ");
                k++;
            }
            System.out.println();
            i++;
            star += 2;
            space--;

        }
    }
}
