package Lecture3;

public class Pattern27 {
    public static void main(String[] args) {
        int i =1;
        int n =5;
        int star = 1;
        int space = n-1;
        while(i<=n){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            int temp = 1;
            while(k<=star){
                System.out.print(temp+" ");
                if(k<=(star/2)){
                    temp++;
                }else{
                    temp--;
                }
                k++;
            }
            System.out.println();
            i++;
            space--;
            star+= 2;
        }

    }
}

