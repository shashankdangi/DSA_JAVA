package Lecture12;

import java.util.Scanner;

public class CB_Number {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "765676";
//		int i = Integer.parseInt(s);// num
//		long ll = Long.parseLong(s);//
        System.out.println(CountCBnumber(s));
    }

    public static int CountCBnumber(String s) {
        int count = 0;
        boolean[] visited = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String s1 = s.substring(i, j);
                if (ISCBNumber(Long.parseLong(s1)) == true && isvisted(visited, i, j - 1) == true) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isvisted(boolean[] visited, int i, int j) {
        // TODO Auto-generated method stub
        for (int k = i; k <= j; k++) {
            if (visited[k] == true) {
                return false;
            }
        }
        return true;

    }

    public static boolean ISCBNumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;

    }
}
