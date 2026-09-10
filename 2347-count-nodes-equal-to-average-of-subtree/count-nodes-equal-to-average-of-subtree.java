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
    //static int sum = 0 , leftSum = 0 , rightSum = 0 , nodes = 0 , count = 0;
    int c = 0;
    public int[] method(TreeNode root)
    {
        int s = 0 , ls = 0 , rs = 0 , n = 0 ;
        //System.out.println("e");
        if(root == null)
            return new int[]{0,0};
        int []arr =  method(root.left);
        int []arr2 = method(root.right);
        n = arr[1] + arr2[1];
        n++;
        s += root.val+arr[0]+arr2[0];
        if(s / n == root.val)
            c++;
        return new int[]{s,n};
    }
    public int averageOfSubtree(TreeNode root) 
    {
        method(root);
        return c;
    }
}