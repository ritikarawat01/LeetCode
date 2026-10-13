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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if( key < root.val) root.left = deleteNode(root.left, key);
        else if(key > root.val) root.right = deleteNode(root.right, key);
        else{
            if(root.right == null){
                return root.left;
            }
            if(root.left == null){
                return root.right;
            }
            // yeh condition tabhi lagegi jab 2 child honge ----- this is problematic condition
            TreeNode suc = FindMin(root.right);
            root.val = suc.val;    // yaha pr tree k right isde ka sabse chota node find krk key se replace krdenge
            root.right = deleteNode(root.right, suc.val);
        }
        return root;

    }
    //yaha pr find krenge tree ka sabse chota node
    public TreeNode FindMin(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}