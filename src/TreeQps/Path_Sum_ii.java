package TreeQps;
import java.util.*;

public class Path_Sum_ii {
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
    class Solution{
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ll = new ArrayList<>();
            List<Integer> kl = new ArrayList<>();
            solve(root, targetSum, ll ,kl);
            System.out.println(ll);
            return ll;
        }
        public void solve(TreeNode root , int tar , List<List<Integer>> ll, List<Integer> kl ){
            if(root.left == null && root.right == null){
                if(tar == root.val){
                    kl.add(root.val);
                    ll.add(kl);
                    return;
                }
            }
            int t = tar - root.val;
            solve(root.left, t , ll , kl);
            solve(root.right, t , ll,  kl);

        }
    }
}
