/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    TreeNode ans=new TreeNode(0);
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root==null||root==q||root==p)
        {
            return root;
        }           

        TreeNode x=lowestCommonAncestor( root.left, p,  q);
        TreeNode y=lowestCommonAncestor( root.right,  p, q);
        if(x!=null&&y!=null)
        {
            return root;
        }
        return (x!=null)?x:y;

        
    }
}