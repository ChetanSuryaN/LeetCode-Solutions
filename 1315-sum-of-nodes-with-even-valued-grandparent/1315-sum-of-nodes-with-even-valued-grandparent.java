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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left!=null) helper(root.left,root.val);
        if(root.right!=null) helper(root.right,root.val);
        return sum;
        
    }
    public void helper(TreeNode root,int prev)
    {
        if(root==null)
        {
            return ;
        }
        if(prev%2==0)
        {
            if(root.right!=null) sum+=root.right.val;
            if(root.left!=null) sum+=root.left.val;
        }
        helper(root.left,root.val);
        helper(root.right,root.val);
    }
}