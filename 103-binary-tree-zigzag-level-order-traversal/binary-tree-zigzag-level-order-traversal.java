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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        q.offer(root);
        boolean leftToRight = true;

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                
                int currVal = q.poll().val;
                if(leftToRight) 
                    subList.add(currVal);
                else
                    subList.add(0, currVal);
            }
            leftToRight = !leftToRight;
            res.add(subList);
        }
        return res;
    }
}