package Lecture21;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(Smallest_Number(s));
    }
    static String Smallest_Number(String s){
        int[] ans = new int[s.length()+1];
        int count = 1;
        for(int i = 0; i<=s.length(); i++){
            if(i == s.length() || s.charAt(i) == 'I'){
                ans[i] = count;
                count++;
                for(int j = i - 1; j>=0 && s.charAt(j) == 'D'; j--){
                    ans[j] = count;
                    count++;
                }
            }
        }
        String out = "";
        for(int i = 0 ; i<ans.length; i++ ){
            out += ans[i];
        }
        return out;
    }
}
