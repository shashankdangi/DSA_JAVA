package Lecture3;

public class Pattern15 {
    public static void main(String[] args) {
        int i  = 1;
        int n  = 5;
        int star = n;
        int space = 0;
        while(i<=2*n-1){
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
            if(i<n){
                star--;
                space+= 2;
            }else{
                star++;
                space -= 2;
            }
            System.out.println();
            i++;
        }
    }
}
