package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123;
        reverse(num);
    }
    static void reverse(int num ){

        int k = 0;
        if(num<0){
            k = -1 * num;
        }else{
            k = num;
        }
        int sum = 0;
        int mul = 1;

        while(k>0){
            int digit = k%10;
            sum = sum * 10 + digit ;
            k /= 10;
        }
        if(num<0){
            sum = sum * -1;
            System.out.println(sum);
        }else {
            System.out.println(sum);
        }



    }
}
