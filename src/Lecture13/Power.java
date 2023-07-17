package Lecture13;

public class Power {
    public static void main(String[] args) {
        int ans = 1;
        System.out.println(Power(2, 3));
        System.out.println(pow(2,3));
        System.out.println(Power1(2,3,ans));

    }

    //Using Recursion head Recursion
    static int Power(int num, int pow) {
        if (pow == 1) {
            return num;
        } else {
            int fn = Power(num, pow - 1);
            return num * fn;
        }
    }

    //Using Recursion Tail Recursion
    static int Power1(int num , int pw , int ans){
        if(pw == 1){
            return ans*num;
        }
        return Power1(num,pw-1,ans*num);
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
