package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder {
    public class Node {
        int val;
        Node left;
        Node right;

    }
    Scanner scn = new Scanner(System.in);
    private Node root;
    public LevelOrder(){
        createTree(root);
    }
    private void createTree(Node root){
        int item = scn.nextInt();
        Node nn = new Node();
        nn.val = item;
        root = nn;
        Queue<Node> q  = new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            Node rv = q.remove();
            int c1 = scn.nextInt();
            int c2 = scn.nextInt();
            if(c1 != -1){
                Node n = new Node();
                n.val = c1;
                rv.left = n;
                q.add(n);
            }
            if(c2 != -1){
                Node m = new Node();
                m.val = c2;
                rv.right = m;
                q.add(m);
            }
        }

    }
}
