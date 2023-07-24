package Lecture15;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        Pnc(str,"");

    }
    static void Pnc(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans+" ");
            return;
        }
        for(int i = 0 ; i<str.length(); i++){
            String s1 = str.substring(0,i);
            String s2 = str.substring(i+1);
            Pnc(s1+s2 , ans + str.charAt(i));
        }
    }

}
