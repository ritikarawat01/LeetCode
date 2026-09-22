/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean helper(TreeNode root,long max,long min){
        if(root == null)return true;
        if(root.val <= min || root.val >= max) return false;

        return (helper(root.left,root.val,min) && helper(root.right,max,root.val));

    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;

        return helper(root,max,min);

        
    }
}