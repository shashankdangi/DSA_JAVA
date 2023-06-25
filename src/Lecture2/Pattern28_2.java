package Lecture2;

public class Pattern28_2 {
    public static void main(String[] args) {
        int i = 1;
        int n= 5;
        int space = n-1;
        while(i<=n){
            int j = 1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            int temp = i;
            while(k<=i){
                System.out.print(temp);
                temp++;
                k++;
            }
            temp -= 2;
            int l = 1;
            while(l<i){
                System.out.print(temp);
                l++;
                temp--;
            }
            System.out.println();
            i++;
            space--;
        }
    }
}
