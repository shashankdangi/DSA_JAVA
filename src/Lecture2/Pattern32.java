package Lecture2;

public class Pattern32 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = 1;
        while (i<=n){
            int j = 1;
            while(j<=star){
                if(j%2 !=0){
                    System.out.print(i+" ");
                }else{
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            i++;
            star+=2;

        }
        i = 1;
        star = 2*n - 3;
        while(i<=n){
            int j = 1;
            while(j<=star){
                if(j%2 !=0){
                    System.out.print(n-i+" ");
                }else{
                    System.out.print("* ");
                }
                j++;

            }
            System.out.println();
            i++;
            star -= 2;
        }
    }
}
