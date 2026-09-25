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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int j=0;
            int ans=-101;
            while(j<size)
            {
                TreeNode curr=queue.poll();
                ans=curr.val;
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
                j++;
            }
            if(ans!=-101)
            {
                list.add(ans);
            }
        } 
        return list;
        
    }
}