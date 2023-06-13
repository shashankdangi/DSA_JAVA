package Lecture1;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        int a = 99;
        int b = 110;
        int c = 56;
        if(a>=b && a >=c){
            System.out.println("a is greater than all ");
        } else if (b>=c && b>=a) {
            System.out.println("b is greater than all ");
        }else{
            System.out.println("c is greater than all ");
        }
    }
}

