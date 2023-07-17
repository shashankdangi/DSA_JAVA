package Lecture12;

public class PalindromString {
    public static void main(String[] args) {
        String str = "nitin";
        SubString2(str);


    }

    //Checks if it is palindrome
    static boolean checkPalindrom(String str){
        int i = 0;
        int j = str.length()-1;
        while( i<j ){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //Print SubString
    static void SubString(String str){

        for(int i = 0 ; i<str.length(); i++){
            for(int j = i+1 ; j<=str.length(); j++){
                String s1 = str.substring(i,j);
                if(checkPalindrom(s1)){
                    System.out.println(s1);
                }
            }
            System.out.println("-------------------");
        }
    }

    //vertical subStrings
    static void SubString2(String str){
        for(int len = 1; len<=str.length(); len++){
            for(int j = len; j<=str.length(); j++){
                int k = j - len;
                System.out.println(str.substring(k,j));
            }
            System.out.println("---------------");
        }
    }

}

