package Lecture17;

import java.util.*;

public class ArrayList2d {
    public static void main(String[] args) {

        int[] coin = {2, 3, 5};
        int amount = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>>  ans = new ArrayList<>();
        pnc(coin, amount, ll, 0, ans);
        System.out.println(ans);
    }

    static void pnc(int[] coin, int amount, List<Integer> ll, int id, List<List<Integer>> ans) {
        if (amount == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = id; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                pnc(coin, amount - coin[i], ll, i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
