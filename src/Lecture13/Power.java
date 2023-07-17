package Lecture13;

public class Power {
    public static void main(String[] args) {
        System.out.println(Power(2, 3));
        System.out.println(pow(2,3));

    }

    //Using Recursion
    static int Power(int num, int pow) {
        if (pow == 1) {
            return num;
        } else {
            int fn = Power(num, pow - 1);
            return num * fn;
        }
    }

    //Using Loop
    static int pow(int num , int pw){
        int sb = 1;
        for(int i =  0 ; i<pw; i++){
            sb *= num;
        }
        return sb;
    }
}
