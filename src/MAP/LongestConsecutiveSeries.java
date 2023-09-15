package MAP;

import java.util.HashMap;

public class LongestConsecutiveSeries {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int []arr){
        HashMap<Integer , Boolean> map = new HashMap<>();
        for(int x : arr){
            if(map.containsKey(x-1)){
                map.put(x,false);
            }else{
                map.put(x,true);
            }
            if(map.containsKey(x+1)){
                map.put(x+1, false);
            }
        }
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key) == true){
                int count = 0;
                while(map.containsKey(key)){
                    count++;
                    key++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;

    }
}
