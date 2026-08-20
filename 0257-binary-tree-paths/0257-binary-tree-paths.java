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
 //preorder + recursion
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        pre(root, arr, "");
        return arr;
    }
    static void pre(TreeNode root, List<String> arr, String s){
        if(root == null){
            return;
        }
        s = s + root.val;
        if(root.left == null && root.right == null){
            arr.add(s);
            return;
        }
        pre(root.left, arr, s+"->");
        pre(root.right, arr, s+"->");
    }
}