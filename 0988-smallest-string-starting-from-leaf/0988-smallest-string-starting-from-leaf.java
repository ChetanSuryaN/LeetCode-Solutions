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
    String min="";
    public String smallestFromLeaf(TreeNode root) 
    {
        calculate(root,"");
        return min;        
    }
    public void calculate(TreeNode root,String s)
    {
        if(root==null)
        {
            return ;
        }
        s+=(char)('a'+root.val);
        if(root.left==null&&root.right==null)
        {
            StringBuilder sb=new StringBuilder(s);
            String str=sb.reverse().toString();
            if(min=="")
            {
                min=str;
            }
        if(str!=""&&str.compareTo(min)<0)
        {
            min=str;
        }
        }
        else if(root.left==null)
        {           
            calculate(root.right,s);
        }
        else if(root.right==null)
        {
            calculate(root.left,s);
        }
        else
        {
            calculate(root.right,s); 
             calculate(root.left,s);           
        }
    }
}