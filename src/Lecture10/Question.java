package Lecture10;
//kth root
public class Question {
    public static void main(String[] args) {
        int k = 3;
        int n = 128;
        int i = 1;
        while(Math.pow(i,k)<=n){

            i++;
        }
        System.out.println(i-1);
    }
}
