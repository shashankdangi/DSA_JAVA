package Generic;

import OOPs.C;

import java.util.Arrays;
import java.util.Comparator;

public class Cars_Client {
    public static void main(String[] args) {
        Car[] ar = new Car[5];
        ar[0] = new Car(200, 10, "White");
        ar[1] = new Car(1000, 20, "Black");
        ar[2] = new Car(345, 3, "Yellow");
        ar[3] = new Car(34, 89, "Grey");
        ar[4] = new Car(8907, 6, "Red");

       Arrays.sort(ar, new Comparator<Car>() {
           @Override
           public int compare(Car o1, Car o2) {
               return o1.speed-o2.speed;
           }
       });
//        Sort(ar);
        Display(ar);

    }
    public static<T extends Comparable<T>> void Sort(T[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                if (arr[i].compareTo(arr[i+1]) > 0 ) {
                    T t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
    }
    static void Display(Car[] ar){
        for(int i = 0 ; i < ar.length; i++){
            System.out.println(ar[i]);
        }

    }
}
