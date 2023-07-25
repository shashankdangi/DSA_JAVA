package Lecture16;

public class CoinCombination {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amount = 8;
        pnc(coin, amount, "", 0);
    }
    static void pnc(int[] coin , int amount , String ans, int id){
        if(amount == 0){
            System.out.println(ans+" ");
            return;
        }
        for(int i = id; i<coin.length; i++){
            if(amount>=coin[i]){
                pnc(coin,amount-coin[i], ans+coin[i], i);
            }
        }
    }
}
