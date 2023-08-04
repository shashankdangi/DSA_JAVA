package Assignment5;

import java.util.Scanner;

public class StringCompression1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Stringcompress(str);

    }
    static void Stringcompress(String value){
        int count = 1;
        String ans = "";
        int i = 1 ;
        for(; i<=value.length()-1; i++){
            char ch = value.charAt(i);
            if(ch == value.charAt(i-1)){
                count++;
            }else{
                ans += value.charAt(i-1);
                ans+= count;
                ch = value.charAt(i);
                count = 1;
            }
        }
        ans += value.charAt(i-1);
        ans += count;
        System.out.println(ans);
    }
}
