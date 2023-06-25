package Lecture2;

public class Pattern28 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int space = n-1;

        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            int sum = i;
            while(k<=i){

                System.out.print(sum);
                sum++;
                k++;
            }
            sum -= 2;

            int l = 1;
            while(l<i){
                System.out.print(sum);
                l++;
                sum--;
            }

            System.out.println();
            i++;
            space--;
        }
    }
}
