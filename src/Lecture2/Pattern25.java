package Lecture2;

public class Pattern25 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int star = 1;
        int sum = 0;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k<=star){
                sum++;
                System.out.print(sum);
                k++;
            }
            System.out.println();
            i++;
            star+=2;

        }
    }
}
