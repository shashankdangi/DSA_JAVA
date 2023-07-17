package Lecture12;

import java.util.Scanner;

public class CB_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(CountCBnumbers("81615"));
    }

    static int CountCBnumbers(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j - len;
                String s1 = str.substring(i, j);
                long num = Long.parseLong(s1);
                if (IsCB_Number(num) && isvisited(visited, i, j - 1)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        return count;
    }

    static boolean isvisited(boolean[] visited, int i, int j) {
        for (int k = i; k <= j; k++) {
            if (visited[k]) {
                return false;
            }
        }
        return true;
    }

    static boolean IsCB_Number(long num) {
        int[] cb = {2, 3, 5, 7, 1, 13, 17, 19, 23,29};
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 0; i < cb.length; i++) {
            if (cb[i] == num) {
                return true;
            } else if (num % cb[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
