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
    public int sumNumbers(TreeNode root) 
    {
        
        calculate(root,0);
        
        return sum;

    }
    public void calculate(TreeNode root,int number)
    {
        if(root==null)
        {
            return ;
        }
        if(root.right==null&&root.left==null)
        {
            number=number*10+root.val;
            sum+=number;
        }
        else
        {
            number=number*10+root.val;
            calculate(root.left,number);
            calculate(root.right,number);
        }
    }
}