package Assignment3;

import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int loop = scn.nextInt();
        while(loop>0){
            int c1,c2,c3,c4;
            c1 = scn.nextInt();
            c2 = scn.nextInt();
            c3 = scn.nextInt();
            c4 = scn.nextInt();
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] rick = new int[n];
            int[] cab = new int[m];
            for(int i = 0 ; i<n; i++){
                rick[i] = scn.nextInt();
            }
            for(int i = 0 ; i<m; i++){
                cab[i] = scn.nextInt();
            }
            int rickTotal = 0;
            for(int i = 0 ; i<n; i++){
                rickTotal += Math.min(c1*rick[i],c2);
            }
            rickTotal = Math.min(rickTotal,c3);

            int cabTotal = 0;
            for(int i = 0 ; i<m ; i++){
                cabTotal += Math.min(c1*cab[i],c2);
            }
            cabTotal = Math.min(cabTotal,c3);

            int result = 0;
            result = Math.min(c4,cabTotal+rickTotal);

            System.out.println(result);

            loop--;
        }


    }

}
