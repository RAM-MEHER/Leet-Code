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
    List<Integer> postOrder = new ArrayList<>();

    public void traverse(TreeNode node)
    {
        if(node == null)
            return;
        traverse(node.left);
        traverse(node.right);
        postOrder.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        traverse(root);
        return postOrder;
    }
}