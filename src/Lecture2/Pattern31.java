package Lecture2;

public class Pattern31 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i<=n){
            int j = 1;
            while(j<=n){
                if(j == n+1-i){
                    System.out.print("* ");
                }else{
                    System.out.print(n+1-j+" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
