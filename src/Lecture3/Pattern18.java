package Lecture3;

public class Pattern18 {
    public static void main(String[] args) {
        int i = 1;
        int n =7;
        int star = 1;
        int space = n/2;
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
            if(i<(n/2)+1){
                star += 2;
                space--;
            }else{
                star -= 2;
                space++;
            }
            System.out.println();
            i++;
        }
    }
}
