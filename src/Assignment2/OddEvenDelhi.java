package Assignment2;

import java.util.Scanner;

public class OddEvenDelhi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        while (i <= n) {
            int num = scn.nextInt();
            check(num);
            i++;
        }
    }
    public static void check(int num) {
        int even = 0;
        int odd = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even += digit;
            } else {
                odd += digit;
            }
            num /= 10;

        }
        if (odd % 3 == 0 || even % 4 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
