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
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) 
    {  
        builder(root);
        return list;     
    }
    public void builder(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        builder(root.left);
        list.add(root.val);
        builder(root.right);
    }
}