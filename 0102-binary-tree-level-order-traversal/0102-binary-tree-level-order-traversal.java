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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> list1=new ArrayList<>();
            int size=queue.size();
            int i=0;
            while(i<size)
            {
            TreeNode current=queue.poll();
            list1.add(current.val);
            if(current.left!=null)queue.add(current.left);
            if(current.right!=null)queue.add(current.right);
            i++;
            }
            list.add(list1);
        }
     return list;
        
    }
}