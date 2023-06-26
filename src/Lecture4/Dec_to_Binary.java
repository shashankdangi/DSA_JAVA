package Lecture4;

public class Dec_to_Binary {
    //binary to dec
    public static void main(String[] args) {
        int num = 100001;
        int mul = 1;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit* mul;
            mul *= 5;
            num /= 10;
        }
        System.out.println(sum);
    }
}
