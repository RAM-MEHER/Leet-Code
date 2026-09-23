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
class Solution 
{
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int len = queue.size();
            ans.add(queue.peek().val);
            for(int i = 0 ; i < len ; i++)
            {
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                queue.poll();
            }
                
        }
        return ans;
    }
}