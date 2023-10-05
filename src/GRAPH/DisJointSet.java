package GRAPH;

import java.util.HashMap;
import java.util.HashSet;

public class DisJointSet {
    public class Node {
        int val;
        int rank;
        Node parent;

    }

    HashMap<Integer, Node> map = new HashMap<>();

    public void CreateSet(int v) {
        Node nn = new Node();
        nn.val = v;
        nn.rank = 0;
        nn.parent = nn;
        map.put(v, nn);

    }

    public int find(int v) {
        Node nn = map.get(v);
        return find(nn).val;  //return the representative element
    }

    private Node find(Node nn) {
        if (nn.parent == nn) {
            return nn;
        }
        return find(nn.parent);

    }

    public void union(int v1, int v2) {
        Node n1 = map.get(v1);
        Node n2 = map.get(v2);
        Node r1 = find(n1);
        Node r2 = find(n2);

        if (r1.rank == r2.rank) {
            r1.parent = r2;
            r2.rank = r2.rank + 1;
        } else if (r1.rank > r2.rank) {
            r2.parent = r1;
        } else {
            r1.parent = r2;
        }
    }

}
