package Lecture3;

public class Pattern33 {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        int space = n-1;
        while(i<=n){
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            int temp = n-i;
            while(k<=i){
              if(k == i){
                  System.out.print("0 ");
              }else{
                  System.out.print(temp+1+" ");
              }
                temp++;
                k++;
            }
            int l = 1;
            int temp2 = n-1;
            while(l<i){
                System.out.print(temp2+" ");
                temp2--;
                l++;
            }
            System.out.println();
            i++;
            space--;
        }
    }
}
