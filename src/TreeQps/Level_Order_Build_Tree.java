package TreeQps;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_Build_Tree {
    Scanner scn = new Scanner(System.in);

    public class Node{
        int data ;
        Node left;
        Node right;
    }
    private Node root;
    public Level_Order_Build_Tree(){
        CreateTree();
    }
    private void CreateTree(){
        Queue<Node> qq = new LinkedList<>();
        int item = scn.nextInt();
        Node nn = new Node();
        nn.data = item;
        root = nn;
        qq.add(nn);
        while(!qq.isEmpty()){
            Node rv = qq.remove();
            int c1  = scn.nextInt();
            int c2 = scn.nextInt();
            if(c1 != -1){
                Node n = new Node();
                n.data = c1;
                rv.left = n;
                qq.add(n);
            }
            if(c2 != -1){
                Node m = new Node();
                m.data = c2;
                rv.right = m;
                qq.add(m);
            }
        }

    }

    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }
    private void PreOrder(Node nn){
        if(nn == null){
            return;
        }
        System.out.print(nn.data +" ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    public static void main(String[] args) {
        Level_Order_Build_Tree lbt = new Level_Order_Build_Tree();
        lbt.PreOrder();

    }

}
