package Lecture19;

public class Prime_Check {
    public static void main(String[] args) {
        int n = 79;
        System.out.println(ISprime(n));
    }
    static  boolean ISprime(int n ){
        int div = 2;
        while(div*div<=n){
            if(n%div == 0){
                return false;
            }
            div++;
        }
        return true;
    }
}
