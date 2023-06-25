package Lecture2;

public class Pattern33 {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        int space = n-1;
        while(i<=n){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            int tem = n+1-i;
            while(k<=i){
               if(k==i){
                   System.out.print("0 ");
               }else{
                   System.out.print(tem+" ");
                   tem++;
               }
                k++;
            }

            tem -= 1;
            int l = 1;


            while(l<i){
                System.out.print(tem+" ");
                tem--;
                l++;
            }

            System.out.println();
            i++;
            space--;
        }
    }
}
