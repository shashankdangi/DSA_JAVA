package Lecture18;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        PrintQueenPath(board,n,0);
    }
    static void PrintQueenPath(boolean[][] board , int tq, int row){
        if(tq == 0){
            Display(board);
            return;
        }
        for(int col = 0 ; col<board[0].length; col++){
            if(issafe(board,row,col) == true){
                board[row][col] = true;
                PrintQueenPath(board,tq-1,row+1);
                board[row][col] = false;
            }
        }
    }

    static boolean issafe(boolean[][] board , int row , int col){
        int r = row ;
        while(r>=0){
            if(board[r][col] == true){
                return false;
            }
            r--;
        }
        //left diagonal
        r = row;
        int c = col;
        while(r>= 0 && c< board[0].length){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c++;
        }

        //right diagonal
        r = row;
        c = col;
        while(r>=0 && c>= 0){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }

    static void Display(boolean[][] board){
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0 ; j<board[0].length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
