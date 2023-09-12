package Assignment8;

import java.util.Scanner;

public class StructurallyIdentical {
    public static class TreeNode{
        int val ;
        TreeNode left;
        TreeNode right;

        public TreeNode(){
            root = CreateTree();
        }
        private TreeNode CreateTree(){
            Scanner scn = new Scanner(System.in);
            TreeNode nn = new TreeNode();
            nn.val = scn.nextInt();
            boolean hlc = scn.nextBoolean();
            if(hlc){
                nn.left = CreateTree();
            }
            boolean hrc = scn.nextBoolean();
            if(hrc){
                nn.right = CreateTree();
            }
            return nn;
        }

    }
    private static TreeNode root;

    public static boolean main(String[] args) {
        TreeNode tr1 = new TreeNode();
        TreeNode tr2 = new TreeNode();

        return Compare(tr1,tr2);
    }
    public static boolean Compare(TreeNode tr1, TreeNode tr2){
        if(tr1 == null && tr2 == null ){
            return true;
        }
        if(tr1 == null || tr2 == null){
            return false;
        }

        boolean left = Compare(tr1.left , tr2.left);
        boolean right = Compare(tr1.right, tr2.right);
        return left && right;
    }
}
