package Lecture2;

public class Pattern18 {
    public static void main(String[] args) {
        int i = 1;
        int n = 7;
        int space = n/2;
        int star = 1;
        while(i<=n/2+1){
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
            star += 2;
            space--;

        }
        i = 1;
        space = 1;
        star = n-2;
        while(i<=(n/2)){
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
            star -= 2;
            space++;
        }
    }
}
