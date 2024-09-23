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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode node) {
        // this is a modified function that checks the height of the binary
        // and if the tree is balanced then returns the height
        // and if the tree is not balanced then returns -1
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}