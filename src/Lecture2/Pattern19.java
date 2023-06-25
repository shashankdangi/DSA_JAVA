package Lecture2;

public class Pattern19 {
    public static void main(String[] args) {
        int i = 1;
        int n = 7;
        int star = n/2;
        int space = 0;

        while(i<=n/2+1){

            int j = 1;
            while(j<=star+1){
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while(k<space){
                System.out.print("  ");

                k++;
            }
            int l = 1;
            if(i==1){

                while(l<=star){
                    System.out.print("* ");
                    l++;
                }
            }else{
                while(l<=star+1){
                    System.out.print("* ");
                    l++;
                }
            }
            System.out.println();
            i++;
            space += 2;
            star--;
        }
        i = 1;
        star = 2;
        space = n-4;
        while(i<=n/2){
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while (k<=space){
                System.out.print("  ");
                k++;
            }
            int l = 1;
            if(i==n/2){
                while (l<star){
                    System.out.print("* ");
                    l++;
                }
            }else{
                while (l<=star){
                    System.out.print("* ");
                    l++;
                }
            }
            System.out.println();
            i++;
            star++;
            space -= 2;
        }
    }
}
