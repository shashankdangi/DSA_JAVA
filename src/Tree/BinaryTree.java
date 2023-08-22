package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner scn = new Scanner(System.in);
    public BinaryTree(){
        root = createTree();
    }
    private Node createTree(){
        int item = scn.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = scn.nextBoolean();
        if(hlc){
            nn.left = createTree();
        }
        boolean hrc = scn.nextBoolean();
        if(hrc){
            nn.right  = createTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn == null){
            return ;
        }
        String str = "";
        str = "<----"+str+nn.val+"--->";
        if(nn.left != null){
            str = nn.left.val + str;
        }else{
            str = "."+str;
        }
        if(nn.right != null){
            str = str+nn.right.val;

        }else{
            str = str+".";
        }
        System.out.println(str);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);

        return Math.max(nn.val,Math.max(left,right));
    }
    private boolean find(Node nn , int item){
        if(nn == null){
            return  false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left  = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;
    }
    public int ht(){
        return ht(this.root);
    }
    private int ht(Node nn){
        if(nn == null){
            return  0;
        }
        int lh = ht(nn.left);
        int rh = ht(nn.right);
        return Math.max(lh,rh)+1;
    }
    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }
    private void PreOrder(Node nn){
        if(nn == null){
            return ;
        }
        System.out.println(nn.val+" ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }
    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }
    private void PostOrder(Node nn){
        if(nn == null){
            return;
        }
        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.println(nn.val+" ");
    }
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node nn){
        if(nn == null){
            return;
        }
        InOrder(nn.left);
        System.out.println(nn.val+" ");
        InOrder(nn.right);
    }
    public void LevelOrder(){
//        LinkedList<Node> q = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.remove();
            System.out.println(rv.val+" ");
            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}
