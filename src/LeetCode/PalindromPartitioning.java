package LeetCode;

import java.util.ArrayList;
import  java.util.*;

public class PalindromPartitioning {
    public static void main(String[] args) {
        List<List<String>> ll = new ArrayList<>();
        List<String> kl = new ArrayList<>();
        String ques = "aab";
        Partitioning(ques,ll, "", kl);
        System.out.println(kl);
    }
    static void Partitioning(String ques, List<List<String>> ll , String ans, List<String> kl){
        if(ques.length() == 0){
            kl.add(ans);
            ll.add(new ArrayList<>(kl));
            return;
        }
        for(int i = 1; i<=ques.length(); i++){
            String s1 = ques.substring(0,i);
            if(isPalindrom(s1)){
                Partitioning(ques.substring(i),ll,ans+s1+"|",kl);
            }

        }
    }
    static boolean isPalindrom(String s1){
        int i = 0 ;
        int j = s1.length()-1;
        while(i<=j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
