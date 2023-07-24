package LeetCode;

import java.util.ArrayList;

public class Keypad {
    //question 17
    static String[] ll = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String num = "237";
        printNum(num , "");
    }
    static  void printNum(String num , String ans){
        if(num.length() == 0){
            System.out.println(ans+" ");
            return;
        }
        int n = num.charAt(0) - '0';
        String val = ll[n];
        for(int i = 0 ; i < val.length(); i++){
            printNum(num.substring(1), ans+val.charAt(i));
        }


    }
}
