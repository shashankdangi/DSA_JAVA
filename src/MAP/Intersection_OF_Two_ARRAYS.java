package MAP;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_OF_Two_ARRAYS {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        intersect(num1,num2);
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int x : nums1){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(int y : nums2){
            if(map.containsKey(y) && map.get(y) > 0){
                ll.add(y);
                map.put(y,map.get(y)-1);
            }
        }
        int[] arr = new int[ll.size()];
        for(int i = 0 ; i < ll.size() ; i++){
            arr[i] = ll.get(i);
        }
        return  arr;
    }
}
