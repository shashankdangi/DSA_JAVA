package Lecture2;

public class Pattern29 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = 1;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                if(k == 1 || k == star){
                    System.out.print(i+" ");
                }else{
                    System.out.print(0+" ");
                }
                k++;
            }
            System.out.println();
            i++;
            star += 2;

        }
    }
}
