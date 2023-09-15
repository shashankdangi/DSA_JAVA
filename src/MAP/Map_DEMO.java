package MAP;

import java.util.*;

public class Map_DEMO {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //ADD
        map.put("Raj",87);
        map.put("Ankit",79);
        map.put("Pooja",68);
        map.put("Niraj",67);
        map.put("Amit",59);
        map.put(null,null);
        System.out.println(map);

        //REMOVE
        System.out.println(map.remove("Ankit")); //case sensitive
        System.out.println(map.remove("VISHAL")); // value doesn't exist
        System.out.println(map);

        //GET
        System.out.println(map.get("Amit"));

        //CONTAINS
        System.out.println(map.containsKey("Amit"));
        System.out.println(map.containsValue(79));


        //TreeMap
        TreeMap<String , Integer> map1 = new TreeMap<>();
        map1.put("Raj",87);
        map1.put("Ankit",79);
        map1.put("Pooja",68);
        map1.put("Niraj",67);
        map1.put("Amit",59);

        System.out.println(map1);

        //Linked HashMap
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Raj",87);
        map2.put("Ankit",79);
        map2.put("Pooja",68);
        map2.put("Niraj",67);
        map2.put("Amit",59);

        System.out.println(map2);


        //LOOP in MAP
        Set<String> set = map.keySet();
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
