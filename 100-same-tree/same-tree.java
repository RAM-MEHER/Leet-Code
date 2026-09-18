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
    boolean same = true;
    public void sameTrees(TreeNode node1 , TreeNode node2)
    {
        if(node1 == null || node2 == null)
        {
            if(node1 == null && node2 == null)
                return;
            else
                same = false;
            return;
        }
        if(node1.val != node2.val)
            same = false;
        sameTrees(node1.left , node2.left);
        sameTrees(node1.right , node2.right);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        //same = true;
        sameTrees(p , q);
        return same;
    }
}