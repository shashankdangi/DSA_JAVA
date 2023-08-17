package OOPs;

public class Client {
    public static void main(String[] args) {
        //Case 1  P | P
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        //Case 2 P | C
        P obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);

    }
}
