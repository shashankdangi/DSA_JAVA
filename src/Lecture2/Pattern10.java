package Lecture2;

public class Pattern10 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i<=n){
            int k = 1;
            while(k<i){
                System.out.print(" ");

                k++;
            }
            int j = 1;
            while(j<=n+1-i){
                System.out.print("x ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
