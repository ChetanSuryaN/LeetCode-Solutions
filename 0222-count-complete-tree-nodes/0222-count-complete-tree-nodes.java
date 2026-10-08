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
   
   
    public int countNodes(TreeNode root) 
    {       
      int left=lefty(root);
      int right=righty(root);
      if(left==right)
      {
        return (int)Math.pow(2,left)-1;
      }  

      int leftval=countNodes(root.left);  
      int rightval=countNodes(root.right);

      return 1+leftval+rightval;
    }
    private int lefty(TreeNode root)
    {
        int x=0;
        while(root!=null)
        {
            x++;
            root=root.left;
        }
        return x;
    }
    private int righty(TreeNode root)
    {
       int x=0;
        while(root!=null)
        {
            x++;
           root=root.right;
        }
        return x;
    }
    

    
}