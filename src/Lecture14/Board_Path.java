package Lecture14;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        PrintPath(0,n,"");
    }
    static void PrintPath(int curr,  int end,String ans){
        if(curr == end){
            System.out.println(ans+" ");
            return;
        }
        if(curr>end){
            return;
        }
       for(int dice = 1; dice<=3; dice++){
           PrintPath(curr+dice , end, ans+dice);
       }

    }
}
