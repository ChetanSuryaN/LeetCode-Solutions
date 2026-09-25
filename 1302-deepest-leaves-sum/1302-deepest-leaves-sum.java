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
    public int deepestLeavesSum(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        int ans=0;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=queue.poll();
                sum+=curr.val;
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            ans=sum;
        }
        return ans;
        
    }
}