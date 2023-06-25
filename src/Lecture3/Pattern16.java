package Lecture3;

public class Pattern16 {
    public static void main(String[] args) {
        int i =1;
        int n = 5;
        int star = n;
        int space = n-1;
        int space2 = 0;
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
            int l = 1;
            while(l<space2){
                System.out.print("  ");
                l++;
            }
            if(i<n){
                space--;
                space2 += 2;
                star--;
            }else{
                space++;
                space2 -= 2;
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
