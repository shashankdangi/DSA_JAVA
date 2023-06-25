package Lecture3;

public class PatternRhombus {
    public static void main(String[] args) {
        int i =1 ;
        int n = 3;
        int space = n-1;
        int star = 1;
        int temp = 1;
        while(i<=(2*n-1)){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            int val = temp;
            while(k<=star){
                System.out.print(val+" ");
                if(k<=star/2 ){
                    val++;
                }else{
                    val--;
                }
                k++;

            }
            System.out.println();

            i++;
            if(i<=n){
                star+=2;
                space--;
                temp++;

            }else{
                star-=2;
                space++;
                temp--;
            }
        }
    }
}
