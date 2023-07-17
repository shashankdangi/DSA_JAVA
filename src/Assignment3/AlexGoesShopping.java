package Assignment3;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            money[i] = scn.nextInt();
        }

        int num = scn.nextInt();

        for (int i = 0; i < num; i++) {
            int target = scn.nextInt();
            int item = scn.nextInt();
            int count = 0;

            for (int j = 0; j < n; j++) {
                if ( target%money[j] == 0) {
                    count++;
                }

            }
            if (count >= item) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
