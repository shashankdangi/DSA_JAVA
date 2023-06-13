package Lecture1;

public class Table {
    public static void main(String[] args) {
        int n = 10;
        int num = 8;
        int i = 1;
        while(i<=n){
            if((num*i)%3 != 0 ){
                System.out.println( num +"x"+ i +"=" + num*i);
            }
            i++;
        }
    }
}
