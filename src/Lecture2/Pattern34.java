package Lecture2;

public class Pattern34 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i<=n){
            int j = 1;
            while(j<=i){
                if(j==i||j==1||i==n){
                    System.out.print(i+" ");

                }else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
