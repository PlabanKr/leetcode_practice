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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans =  new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        // check if the tree is empty or not
        if(root == null)
            return ans;
        // insert the root into the queue
        q.offer(root); // offer is same as add but checks if the queue is at max capacity or not
        // traverse through the queue
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0; i < levelSize; i++) {
                // check if the current element in the queue has children
                // add the children in the queue
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                // remove the current element and add to the sub list
                subList.add(q.poll().val); // we only need the int value
            }
            // finally add the sub list to the ans
            ans.add(subList);
        }
        return ans;
    }
}