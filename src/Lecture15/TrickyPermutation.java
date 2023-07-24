package Lecture15;

public class TrickyPermutation {
    public static void main(String[] args) {
        String ques = "abca";
        Pnc(ques,"");
    }
    static void Pnc(String str, String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
          boolean val = false;
          for(int j = i + 1; j<str.length(); j++){
              if(str.charAt(j) == str.charAt(i)){
                  val = true;
                  break;
              }
          }
          if(val == false){
              String s1 = str.substring(0, i);// ith char pehel
              String s2 = str.substring(i + 1);// ith char ke baad
              Pnc(s1 + s2, ans + str.charAt(i));
          }
        }
    }
}
