package Lecture2;

public class Pattern8 {
    public static void main(String[] args) {
        int i = 1;
        int n= 5;
        while(i<=n){
            int j = 1;
            while(j<=n){
                if(j== i || j == n+1-i){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
