package Lecture4;


import java.util.Scanner;

public class Winner {

        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int i = 1;
            while(i<=n){
                int M = scn.nextInt();
                int N = scn.nextInt();
                winner( M ,  N);
                i++;
            }


        }
        public static void winner( int M ,  int N){
            int i = 1;
            int count = 0;
            int aayush = 0;
            int harshit  = 0;
            while(true){
                if(count%2 == 0){
                    count++;
                    aayush = count;
                }else{
                    count++;
                    harshit = count;
                }

                if(aayush>M){
                    System.out.println("Harshit");
                    break;
                }else if(harshit>N){
                    System.out.println("Aayush");
                    break;
                }
            }

        }

}
