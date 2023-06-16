package Lecture2;

public class Pattern21_1 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = 1;
        int space = 2*n-3;
        while(i<=n){
            int j = 1;
            while(j<=star){
                System.out.print("x ");
                j++;
            }
            int k = 1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int l = 1;
            if(i==n){
                while(l<=star-1){
                    System.out.print("x ");
                    l++;
                }
            }else{
                while(l<=star){
                    System.out.print("x ");
                    l++;
                }
            }
            System.out.println();
            i++;
            star++;
            space -= 2;
        }
    }
}
