package Lecture1;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        int cout = 0;
        while(i<n){
            if(n%i  == 0){
                cout += 1;
                break;
            }
            i++;
        }
        if(cout>=1){
            System.out.println("Not Prime");
        }else{
            System.out.println(" Prime");
        }
    }
}

