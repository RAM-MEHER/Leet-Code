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
    int goodNodes = 0;

    public void traverse(TreeNode node , int maxValue)
    {
        if(node == null)
            return;
        if(node.val >= maxValue)
            goodNodes++;
        traverse(node.left , node.val > maxValue ? node.val : maxValue);
        traverse(node.right , node.val > maxValue ? node.val : maxValue);
    }
    public int goodNodes(TreeNode root) 
    {
        // goodNodes = 0;
        traverse(root , root.val);
        return goodNodes;
    }
}