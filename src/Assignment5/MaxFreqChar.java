package Assignment5;

import java.util.Scanner;

public class MaxFreqChar {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        countfreq(str);
    }
    static void countfreq(String str){
        int[] chars = new int[26];
        int count = 1;
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            chars[ch-97] = chars[ch-97]+1;
        }
        int max_i = 0;
        for(int i = 1 ; i<chars.length; i++){
            if(chars[i] > chars[max_i]){
                max_i = i;
            }
        }
        char ans = (char) (97+max_i);
        System.out.println(ans);
    }
}
