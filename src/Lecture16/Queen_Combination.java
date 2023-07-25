package Lecture16;

public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        Combination(board, tq, "" , 0 , 0);

    }
    static void Combination(boolean[] board , int tq , String ans , int qpsf, int id){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i = id ; i<board.length; i++){
            if(board[i] == false){
                board[i] = true;
                Combination(board,tq,ans+"b"+i+"q"+qpsf+" ",qpsf+1, i+1);
                board[i] = false;
            }
        }
    }
}
