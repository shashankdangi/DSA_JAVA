package BinarySearchTree;

public class Insert_Into_BinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode InsertIntoBST(TreeNode root, int val) {
            if(root == null){
                return new TreeNode(val);
            }
            if (root.val < val) {
                root.left = InsertIntoBST(root.right,val);
            } else {
                root.right = InsertIntoBST(root.left, val);
            }
            return root;
        }
    }
}
