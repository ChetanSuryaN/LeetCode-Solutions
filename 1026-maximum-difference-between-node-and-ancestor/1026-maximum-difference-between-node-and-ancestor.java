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
    int ans=Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }       
        helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return ans;
    }
    public void helper(TreeNode root,int max,int min)
    {
        if(root==null)
        {
            ans=Math.max(ans,max-min);
            return ;
        }
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        helper(root.left,max,min);
        helper(root.right,max,min);
    }
}