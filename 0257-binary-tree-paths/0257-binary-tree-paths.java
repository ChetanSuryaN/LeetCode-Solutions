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
class Solution {
    List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) 
    {
        create(root,"");
        return list;
    }
    public void create(TreeNode root,String s)
    {
        if(root==null)
        {
            return ;
        }
        if(s.equals(""))
        {
            s=String.valueOf(root.val);
        }
        else
        {
        s=s+"->"+String.valueOf(root.val);
        }
        if(root.right==null&&root.left==null)
        {
            list.add(s);            
        }
        create(root.left,s);
        create(root.right,s);
        
    }
}