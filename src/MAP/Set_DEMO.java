package MAP;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_DEMO {
    public static void main(String[] args) {
        //HashSET
        HashSet<Integer> set = new HashSet<>();
        set.add(-9);
        set.add(90);
        set.add(39);
        set.add(46);
        set.add(2);
        System.out.println(set);


        //Loop in SET
        for(int x : set){
            System.out.print(x+" ");
        }
        System.out.println();


        //TreeSET
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(-9);
        set1.add(90);
        set1.add(39);
        set1.add(46);
        set1.add(2);
        System.out.println(set1);

        //LinkedHashSet
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(-9);
        set2.add(90);
        set2.add(39);
        set2.add(46);
        set2.add(2);
        System.out.println(set2);



    }
}
