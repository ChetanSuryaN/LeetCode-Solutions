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
    public long kthLargestLevelSum(TreeNode root, int k) 
    {
      List<Long> list=new ArrayList<>();
      Queue<TreeNode> queue=new LinkedList<>();
      if(root==null)
      {
        return -1;
      }          
      queue.add(root);
      while(!queue.isEmpty())
      {
        long sum=0;
         int size=queue.size();
         for(int i=0;i<size;i++)
         {
            TreeNode curr=queue.poll();
            sum+=curr.val;
            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);

         }
         list.add(sum);
      }
      list.sort(Comparator.naturalOrder());
      if(list.size()<k)
      {
        return -1;
      }
      return list.get(list.size()-k);
    }
}