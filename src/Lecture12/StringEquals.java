package Lecture12;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(equals(s1,s2));
    }
    static  boolean equals(String s1, String s2){
        if(s1 == s2){
            return true;
        }if(s1.length() != s2.length()){
            return  false;
        }
        for(int i = 0 ; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }else{
                return true;
            }
        }
        return true;

    }

}