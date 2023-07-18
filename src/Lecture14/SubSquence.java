package Lecture14;

public class SubSquence {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.print("\n"+seq(ques, ""));

    }

    static int seq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        char ch = ques.charAt(0);
        int a1 = seq(ques.substring(1), ans);
        int a2 = seq(ques.substring(1), ans + ch);
        return a1+a2;
    }
}
