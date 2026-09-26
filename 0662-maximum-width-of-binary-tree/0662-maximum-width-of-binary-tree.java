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
    public int widthOfBinaryTree(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<Integer> value=new LinkedList<>();
        queue.add(root);
        value.add(0);
        int ans=0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int start=-1;
            int end=-1;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=queue.poll();
                int index=value.poll();
                if(start==-1)
                {
                    start=index;                    
                }
                end=index;
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                    value.add(2*index+1);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                    value.add(2*index+2);
                }
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
        
    }
}