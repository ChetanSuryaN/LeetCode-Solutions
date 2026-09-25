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
    public int maxLevelSum(TreeNode root) 
    {
        int max=Integer.MIN_VALUE;
        int maxpos=-1;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=1;
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
            if(sum>max)
            {
                max=sum;
                maxpos=level;
            }
            level++;
        } 
        return maxpos;      
    }
}