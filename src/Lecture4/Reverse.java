package Lecture4;

public class Reverse {
    public static void main(String[] args) {
        int n = 7385;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum*10 + rem;
            n /= 10;
        }
        System.out.println(sum);
        

    }
}
