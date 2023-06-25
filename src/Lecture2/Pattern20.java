package Lecture2;
public class Pattern20 {
    public static void main(String[] args) {
        int i = 1;
        int n = 7;
        int star = 1;
        int space = n-4;
        int midRow = (n+1)/2;
        boolean inc = true;
        while(i<=n){
            int j = 1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                if(k==1||k==star){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                k++;
            }
            System.out.println();
            if(i == midRow){
                inc = false;
            }
            if(inc){
                space--;
                star += 2;
            }else{
                space++;
                star -=2;
            }
            i++;



        }
    }
}
