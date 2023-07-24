package Lecture15;

public class Pair_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        Pair(n, "", 0, 0);
    }

    static void Pair(int n, String ans, int open, int close) {
        if(open==n && close==n){
            System.out.println(ans+" ");
            return;
        }
        if (open < n) {
            Pair(n, ans + "(", open + 1, close);
        }
        if (close < open) {
            Pair(n, ans + ")", open, close + 1);
        }

    }
}
