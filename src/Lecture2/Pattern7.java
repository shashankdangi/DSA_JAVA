package Lecture2;

public class Pattern7 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i<=n){
            int j = 1;
            while(j<=(n)){
                if(i == 1||j==n || j==1 || i==n){

                    System.out.print("x ");
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
