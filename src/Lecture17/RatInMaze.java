package Lecture17;

import java.util.Scanner;

public class RatInMaze {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        char[][] nm = new char[n][m]; // Use "char" instead of "Character" for the array type.
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = scn.next();
            for (int j = 0; j < s.length(); j++) {
                nm[i][j] = s.charAt(j); // Corrected the method call to next() and charAt(0).
            }
        }
        ratinmaze(nm, 0,0, ans);
        if(flag == false){
            System.out.println("NO PATH FOUND");
        }

    }
    static boolean flag = false;
    static void ratinmaze(char[][] arr , int cr , int cc , int[][] ans){
        if(cr == arr.length-1 && cc == arr[0].length-1 && arr[cr][cc] != 'X'){
            ans[cr][cc] = 1;
            Display(ans);
            flag = true;
            return;

        }
        if(cr<0 || cc<0 || cr>=arr.length || cc>= arr[0].length || arr[cr][cc] == 'X'){
            return;
        }
        arr[cr][cc] = 'X';
        ans[cr][cc] = 1;
        ratinmaze( arr, cr-1 , cc,ans ); //up
        ratinmaze(arr, cr+1, cc , ans); //down
        ratinmaze(arr, cr, cc+1, ans); //right
        ratinmaze(arr,cr,cc-1, ans);// left
        ans[cr][cc] = 0;
        arr[cr][cc] = 'O';
    }
    static void Display(int[][] ans){
        for(int i = 0  ; i < ans.length; i++){
            for(int j = 0 ; j<ans[0].length ; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
