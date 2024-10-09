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
    public int maxPathSum(TreeNode root) {
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPathSum(root, maxVal);
        return maxVal[0];
    }

    public int maxPathSum(TreeNode node, int[] maxVal) {
        if(node == null)
            return 0;
        // also check if the sum is negative return 0
        int leftPathSum = Math.max(0, maxPathSum(node.left, maxVal));
        int rightPathSum = Math.max(0, maxPathSum(node.right, maxVal));
        // maxVal stores the acutal answer of the maximum path sum
        // this maxVal stores the path that has highest sum
        maxVal[0] = Math.max(maxVal[0], node.val + leftPathSum + rightPathSum);
        // return max sum of current node
        return Math.max(leftPathSum, rightPathSum) + node.val;
    }
}