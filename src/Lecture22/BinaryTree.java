package Lecture22;

import java.util.Scanner;

public class BinaryTree {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BinaryTree() {
        root = CreateTree();
    }

    public void Display() {
        Display(root);
    }

    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String s = "";
        s = "<-" + nn.data + "->";
        if (nn.left != null) {
            s = nn.left.data + s;
        } else {
            s = "." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.data;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public boolean find(int item){
        return find(this.root,item);
    }

    //PreOrder
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    private void PreOrder(Node nn){
        if(nn == null){
            return;
        }
        System.out.print(nn.data + "");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    //Post Order
    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }
    private void PostOrder(Node nn){
        if(nn == null){
            return;
        }
        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.print(nn.data + " ");
    }

    //In Order
    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node nn){
        if(nn == null){
            return;
        }
        InOrder(nn.left);
        System.out.print(nn.data+" ");
        InOrder(nn.right);
        System.out.println();
    }
    //height
    public int ht(){
        return ht(this.root);
    }
    private int ht(Node nn){
        if(nn == null){
            return -1;
        }
        int lh = ht(nn.left);
        int rh = ht(nn.right);
        return Math.max(lh,rh)+1;
    }
    private boolean find(Node nn , int item){
        if(nn == null){
            return false;
        }
        if(nn.data == item){
            return true;
        }

        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;
    }
    public int max() {
        return max(root);
    }

    private int max(Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.data, Math.max(left, right));
    }

    Scanner scn = new Scanner(System.in);

    private Node CreateTree() {
        int item = scn.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = scn.nextBoolean();
        if (hlc == true) {
            nn.left = CreateTree();
        }
        boolean hrc = scn.nextBoolean();
        if (hrc == true) {
            nn.right = CreateTree();
        }
        return nn;
    }
}
