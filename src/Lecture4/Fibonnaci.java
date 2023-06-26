package Lecture4;

public class Fibonnaci {
    public static void main(String[] args) {
        int i = 1;
        int n = 1;
        int a = 0;
        int b = 1;
        while(i<=n){
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;

        }
        System.out.println();
        System.out.println("Value of "+(n)+"th is : "+ a);

    }
}
