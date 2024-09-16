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
    // public int maxDepth(TreeNode root) {
    //     if(root == null) return 0;
    //     int lh = maxDepth(root.left);
    //     int rh = maxDepth(root.right);
    //     return 1 + Math.max(lh, rh);
    // }

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int level = queue.size();
            for(int i = 0; i < level; i++) {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                queue.poll();
            }
            depth++;
        }
        return depth;
    }
}










