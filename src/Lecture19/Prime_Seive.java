package Lecture19;

public class Prime_Seive {
    public static void main(String[] args) {
        int n = 100;
        PrimeSeive(n);
    }
    static void PrimeSeive(int n ){
        boolean[] prime = new boolean[n+1];
        for(int i = 2; i<prime.length; i++){
            prime[i] = true;
        }
        for(int i = 2; i*i <= prime.length; i++){
            if(prime[i] == true){
                for(int j = 2; j*i < prime.length; j++){
                    prime[j*i] = false;
                }
            }
        }
        for(int i = 0 ;i<prime.length; i++){
            if(prime[i] == true){
                System.out.println(i+" ");
            }
        }
    }
}
