package Assignment5;

import java.util.Scanner;

public class FindCBNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String digits = scn.next();
        cbnumb(digits);
    }
    static void cbnumb(String digits){
        boolean[] flag = new boolean[digits.length()];
        String ans = "";
        for(int i = 0 ; i<digits.length(); i++){
            char ch = digits.charAt(i);
            int num = Integer.parseInt();


        }

    }
    static boolean isCBNum(int num){
        if(num == 0 || num == 1){
            return false;
        }
        int[] cb = {2,3,5,7,11,13,17,19,23,29};
        for(int i = 0 ; i<cb.length; i++){
            if(cb[i] == num){
                return true;
            }else if(num%cb[i] != 0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

}
