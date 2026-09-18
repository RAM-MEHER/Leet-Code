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
    boolean balanced = true;

    public int heightBalanced(TreeNode node)
    {
        if(node == null)
            return 0;
        int leftDepth = heightBalanced(node.left);
        int rightDepth = heightBalanced(node.right);
        if(Math.abs(leftDepth-rightDepth) >= 2)
            balanced = false;
        return 1+Math.max(leftDepth , rightDepth);
    }
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
            return true;
        heightBalanced(root);
        return balanced;
    }
}