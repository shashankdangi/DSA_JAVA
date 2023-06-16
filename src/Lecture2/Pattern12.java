package Lecture2;

public class Pattern12 {
    public static void main(String[] args) {
        int i = 1;
        int n= 5;
        while(i<=n){
            int k = 1;
            while(k<=(n-i)){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while(j<=i){
                if(j%2 == 0){
                    System.out.print("!");
                }else{
                    System.out.print("x");
                }
                j++;
            }
            int l = 1;
            while(l<i){
                if(i%2 == 0){
                    if(l%2 == 0){
                        System.out.print("!");
                    }else{
                        System.out.print("x");
                    }

                }else{
                    if(l%2 == 0){
                        System.out.print("x");
                    }else{
                        System.out.print("!");
                    }

                }
                l++;
            }

            System.out.println();
            i++;
        }
    }
}
