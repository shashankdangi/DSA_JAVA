package GRAPH;

import java.util.HashSet;

public class Graph_Client {
    public static void main(String[] args) {
        graph g = new graph(7);
        g.AddEdge(1,2,3);
        g.AddEdge(1,4,2);
        g.AddEdge(4,3,5);
        g.AddEdge(2,3,10);
        g.AddEdge(4,5,6);
        g.AddEdge(5,6,7);
        g.AddEdge(5,7,6);
        g.AddEdge(6,7,5);
        g.Display();
        System.out.println(g.haspath(1,6,new HashSet<>()));
        g.Allpath(1,6,new HashSet<>(),"");
    }
}
