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
    List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        list=new ArrayList<>();
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
        builder(root.right);
        list.add(root.val);
    }
}