package Lecture13;

public class RecursionQues {
    public static void main(String[] args) {
        int num = 7;
        dec(num);
        System.out.println("----------------");
        inc(num);
    }
   //Decreasing
    static void dec(int num) {
        if (num == 1) {
            System.out.println("1");
        } else {
            System.out.println(num);
            dec(num - 1);

        }

    }
    static void inc(int num){
        if(num == 0){
            return;
        }else{
            inc(num-1);
            System.out.println(num);
        }

    }
}

