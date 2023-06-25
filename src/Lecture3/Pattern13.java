package Lecture3;

public class Pattern13 {
    public static void main(String[] args) {
        int i= 1;
        int n= 5;
        int star = 1;
        while(i<=2*n-1){
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(i<n){
                 star++;
            }else{
                star--;
            }
            System.out.println();
            i++;
        }
    }
}
