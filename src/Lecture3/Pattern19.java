package Lecture3;

public class Pattern19 {
    public static void main(String[] args) {
        int i =1;
        int n =7;
        int star = (n/2)+1;
        int space = 0;
        while(i<=n){
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            int l = 1;
            if(i == 1|| i == n){
                while(l<star){
                    System.out.print("* ");
                    l++;
                }
            }
            else{
                while(l<=star){
                    System.out.print("* ");
                    l++;
                }
            }
            if(i<(n/2)+1){
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
