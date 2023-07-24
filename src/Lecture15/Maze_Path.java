package Lecture15;

public class Maze_Path {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        PrintPath(0,0,n-1,m-1,"");
    }
    static void PrintPath(int cr , int cc , int er, int ec, String ans){
        if(cr == er && cc == ec){
            System.out.println(ans+" ");
            return;
        }
        if(cr>er || cc>ec){
            return;
        }
        PrintPath(cr,cc+1, er , ec, ans + "H");
        PrintPath(cr+1,cc, er , ec, ans + "V");
    }
}
