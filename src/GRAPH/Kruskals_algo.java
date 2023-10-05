package GRAPH;

import java.util.*;

public class Kruskals_algo {
     HashMap<Integer , HashMap<Integer, Integer>> map;

     public Kruskals_algo(int v){
         this.map = new HashMap<>();
         for(int i = 1 ; i <= v ; i++){
             map.put(i , new HashMap<>());
         }
     }

     public void addEdge(int v1 , int v2 , int cost){
         map.get(v1).put(v2,cost);
         map.get(v2).put(v1,cost);
     }
     public class EdgePair{
         int e1;
         int e2;
         int cost ;
         public EdgePair(int e1 , int e2 , int cost){
             this.e1 = e1;
             this.e2 = e2;
             this.cost = cost;
         }
         @Override
         public String toString(){
             return e1+"-"+e2+"@"+cost;
         }
     }

     public ArrayList<EdgePair> getalledge(){
         ArrayList<EdgePair> list = new ArrayList<>();
         for(int e1 : map.keySet()){
             for(int e2 : map.get(e1).keySet()){
                 EdgePair eg = new EdgePair(e1, e2, map.get(e1).get(e2));
                 list.add(eg);
             }
         }
         return list;
     }

     public void KruskalsAlgo(){
         int ans = 0;

         DisJointSet ds = new DisJointSet();
         for(int k : map.keySet() ){
             ds.CreateSet(k);
         }
         ArrayList<EdgePair> ll = getalledge();
         Collections.sort(ll, new Comparator<EdgePair>() {
             @Override
             public int compare(EdgePair o1, EdgePair o2) {
                 return o1.cost - o2.cost;
             }
         });
         for(EdgePair edge : ll ){
             int e1 = edge.e1;
             int e2 = edge.e2;
             int r1  = ds.find(e1);
             int r2 = ds.find(e2);
             if(r1 != r2){
                 ds.union(r1,r2);
                 System.out.println(edge);
                 ans += edge.cost;
             }
         }
         System.out.println(ans);
     }
     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         Kruskals_algo ks = new Kruskals_algo(n);
         int m = scn.nextInt();
         for(int i = 0 ; i < m ; i++){
             int v1 = scn.nextInt();
             int v2 = scn.nextInt();
             int cost = scn.nextInt();
             ks.addEdge(v1,v2,cost);
         }
         ks.KruskalsAlgo();
     }
}
