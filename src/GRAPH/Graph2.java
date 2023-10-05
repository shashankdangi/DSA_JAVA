package GRAPH;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graph2 {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph2(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean BFS(int src, int des) {
        LinkedList<Integer> qq = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        qq.add(src);
        while (!qq.isEmpty()) {
            //1. Remove
            int r = qq.remove();
            //2. Ignore (if already being visited)
            if (visited.contains(r)) {
                continue;
            }
            //3. Visited (Mark the value as Visited)
            visited.add(r);

            //4. Work
            if (r == des) {
                return true;
            }

            //5. Add the neighbours
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    qq.add(nbrs);
                }
            }

        }
        return false;
    }

    public boolean DFS(int src , int des){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            //1. Remove
            int r = st.pop();
            //2. Ignore (if already being visited)
            if (visited.contains(r)) {
                continue;
            }
            //3. Visited (Mark the value as Visited)
            visited.add(r);

            //4. Work
            if (r == des) {
                return true;
            }

            //5. Add the neighbours
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.push(nbrs);
                }
            }

        }
        return false;
    }

    public void BFT(){
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
                    continue;
                }
                //3. Visited (Mark the value as Visited)
                visited.add(r);

                //4. Work
                System.out.print(r + " -> ");

                //5. Add the neighbours
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }

            }
        }

    }

    public void DFT(){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src : map.keySet()) {
            st.push(src);
            while (!st.isEmpty()) {
                //1. Remove
                int r = st.pop();
                //2. Ignore (if already being visited)
                if (visited.contains(r)) {
                    continue;
                }
                //3. Visited (Mark the value as Visited)
                visited.add(r);

                //4. Work
                System.out.print(r + " ");

                //5. Add the neighbours
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }

            }
        }
    }

    public boolean isCycle(){
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
                    return true;
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
        return false;
    }

    public boolean isConnected(){
        LinkedList<Integer> qq = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;
        for(int src : map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            count++;
            qq.add(src);
            while (!qq.isEmpty()) {
                //1. Remove
                int r = qq.remove();
                //2. Ignore (if already being visited)
                if (visited.contains(r)) {
                    continue;
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
        return count == 1 ;
    }

}
