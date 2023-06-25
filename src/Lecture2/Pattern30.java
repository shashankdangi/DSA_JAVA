package Lecture2;

public class Pattern30 {
    public static void main(String[] args) {
        int i = 1;
        int n  = 5;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print(n+1-j+" ");
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
