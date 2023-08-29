package TreeQps;

public class Balanced_Binary_Tree {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  class Solution{
         public boolean isBalanced(TreeNode root){
             return Balanced(root).isbal;
         }
         public BalPair Balanced(TreeNode root){
             if(root == null){
                 return new BalPair();
             }
             BalPair lbp = Balanced(root.left);
             BalPair rbh = Balanced(root.right);
             BalPair sbp = new BalPair();
             sbp.ht = Math.max(lbp.ht, rbh.ht) + 1;
             sbp.isbal = lbp.isbal && rbh.isbal && Math.abs(lbp.ht- rbh.ht) <= 1;
             return sbp;
         }
  }
  class BalPair{
         boolean isbal = true;
         int ht = -1;
  }
}
