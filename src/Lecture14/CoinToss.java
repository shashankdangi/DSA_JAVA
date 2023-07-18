package Lecture14;

public class CoinToss {
    public static void main(String[] args) {
        int n = 3;
        coinToss(n,"");
    }
    static void coinToss(int n , String ans){
        if(n == 0){
            System.out.println(ans+" ");
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H'){
            coinToss(n-1,ans+"H");
        }
        coinToss(n-1,ans+"T");
    }
}
