package GRAPH;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph_Valid_Tree {
    class Solution{
        public boolean validTree(int n , int[][] edges){
            HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
            for(int i = 0 ; i < n; i++){
                map.put(i, new HashMap<>());
            }
            for(int i  = 0 ; i < edges.length; i++){
                int v1 = edges[i][0];
                int v2 = edges[i][1];
                map.get(v1).put(v2,1);
                map.get(v2).put(v1,1);
             }
            return isTree(map);
        }

        public boolean isTree(HashMap<Integer,HashMap<Integer,Integer>> map){
            LinkedList<Integer> qq = new LinkedList<>();
            HashSet<Integer> visited = new HashSet<>();
            for(int src : map.keySet()) {
                if(visited.contains(src)){
                    continue;
                }
                qq.add(src);
                while (!qq.isEmpty()) {
                    //1. Remove
                    int r = qq.remove();
                    //2. Ignore (if already being visited)
                    if (visited.contains(r)) {
                        return false ;
                    }
                    //3. Visited (Mark the value as Visited)
                    visited.add(r);


                    //5. Add the neighbours
                    for (int nbrs : map.get(r).keySet()) {
                        if (!visited.contains(nbrs)) {
                            qq.add(nbrs);
                        }
                    }

                }
            }
            return true;
        }

    }
}
