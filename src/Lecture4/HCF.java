package Lecture4;

import org.w3c.dom.ls.LSOutput;

public class HCF {
    public static void main(String[] args) {
        int i = 1;
        int a = 60;
        int b = 36;

        while(b%a != 0){
            int rem = b%a;
             b = a;
             a = rem;
        }
        System.out.println(a);

       }

}
