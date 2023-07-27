package Lecture16;

public class StringCompression {

    public static void main(String[] args) {
        String str = "aaa";
        checkString(str,'a',0, 0, "");
    }
    static void checkString(String str, char ch , int count, int id , String ans){
        if(id == str.length()){
            System.out.println(ans);
            return;
        }
        int i = id;
        for( ; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }{
                break;
            }
        }
        checkString(str,ch,count,count, ans+count);
    }


}